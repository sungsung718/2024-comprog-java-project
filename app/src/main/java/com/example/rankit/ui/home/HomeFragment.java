package com.example.rankit.ui.home;

import static androidx.navigation.fragment.FragmentKt.findNavController;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.rankit.R;
import com.example.rankit.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;
    private FragmentHomeBinding binding;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        System.out.println("HomeFragment.onAttach");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
        @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.createRankButton.setOnClickListener( v -> {
                v.setActivated(true);
                findNavController(this).navigate(R.id.action_homeFragment_to_createFragment);
            }
        );
        System.out.print("HomeFragment.onCreateView");

        return root;
    }

}