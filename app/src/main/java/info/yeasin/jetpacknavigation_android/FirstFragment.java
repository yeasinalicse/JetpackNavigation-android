package info.yeasin.jetpacknavigation_android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import info.yeasin.jetpacknavigation_android.databinding.FirstFragmentBinding;

public class FirstFragment extends Fragment {
    FirstFragmentBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.first_fragment, container, false);
        binding = DataBindingUtil.inflate(inflater, R.layout.first_fragment, container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final Bundle bundle = new Bundle();
        bundle.putBoolean("test_boolean", true);

        final NavController navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);

        binding.buttonFrag1.setOnClickListener((View v)->{
            navController.navigate(R.id.action_firstFragment_to_secondFragment, bundle);

        });


    }

}
