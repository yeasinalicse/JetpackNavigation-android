package info.yeasin.jetpacknavigation_android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;

public class SecondFragment extends Fragment {

    ViewDataBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.second_fragment,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getActivity().getApplicationContext(), "Bundle args " + getArguments().getBoolean("test_boolean"), Toast.LENGTH_SHORT).show();

        binding.buttonFrag2.setOnClickListener((View v)->{
            final NavController navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);
                navController.navigateUp();
        });
    }

}
