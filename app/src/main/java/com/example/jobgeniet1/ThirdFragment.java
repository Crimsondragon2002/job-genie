package com.example.jobgeniet1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


import com.example.jobgeniet1.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {
    private FragmentThirdBinding binding;
    //old code that used to try and be an extra failsafe in case the value for second frag didn't work
    private boolean thirding = true;
    public boolean getThirding(){
        return thirding;
    }
    void  setThirding(boolean third){
        this.thirding = third;
    }
    @Override
    //seems to allow xml to be viewed
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        setThirding(true);
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
   
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        setThirding(true);
        super.onViewCreated(view, savedInstanceState);
        //checks on if the previous button is clicked
        binding.thirdPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //uses navGraph action "Third to first fragment" to move to first fragment
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_FirstFragment);
            }
        });
        binding.thirdNext.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                //uses navGraph action "Third to fourth fragment" to move to fourth fragment
                setThirding(false);
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_FourthFragment);
            }
        });


    }

    @Override
    public void onDestroyView() {
        setThirding(false);
        super.onDestroyView();
        binding = null;
    }
}
