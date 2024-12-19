package com.example.rankit.ui.create;

import androidx.lifecycle.ViewModel;
import com.example.rankit.data.repository.RankRepository;
import com.example.rankit.utils.Rank;

public class CreateViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public void createRank(RankRepository repository, Rank rank) {
        repository.createItem(rank);
    }
}