package com.example.rankit.ui.create;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.rankit.R;
import com.example.rankit.databinding.FragmentCreateBinding;

public class CreateFragment extends Fragment {

    private CreateViewModel mViewModel;

    public static CreateFragment newInstance() {
        return new CreateFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
        @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(CreateViewModel.class);
        FragmentCreateBinding binding = FragmentCreateBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        binding.createRankButton.setOnClickListener( v -> {
//                v.setActivated(true);
//                mViewModel.createRank();
//            }
//        );

        return root;
    }

}