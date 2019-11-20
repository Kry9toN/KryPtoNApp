package com.krypton.kernelmanager.fragments.other;

import com.krypton.kernelmanager.R;
import com.krypton.kernelmanager.fragments.recyclerview.RecyclerViewFragment;
import com.krypton.kernelmanager.utils.Utils;
import com.krypton.kernelmanager.views.recyclerview.DescriptionView;
import com.krypton.kernelmanager.views.recyclerview.ImageView;
import com.krypton.kernelmanager.views.recyclerview.RecyclerViewItem;
import com.krypton.kernelmanager.views.recyclerview.TitleView;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 * Created by Morogoku on 05/12/2017.
 */

public class DonationFragment extends RecyclerViewFragment {


    @Override
    protected boolean showViewPager() {
        return false;
    }

    @Override
    protected void addItems(List<RecyclerViewItem> items) {

        TitleView title = new TitleView();
        title.setText(getString(R.string.donation_title));

        items.add(title);


        DescriptionView desc = new DescriptionView();
        desc.setDrawable(getResources().getDrawable(R.drawable.logo));
        desc.setSummary(getString(R.string.donation_summary));
        desc.setOnItemClickListener(item
                -> Utils.launchUrl("https://www.paypal.me/morogoku", Objects.requireNonNull(getActivity())));

        items.add(desc);


        String leng = Locale.getDefault().getLanguage();

        ImageView img = new ImageView();
        if(leng.contains("es")){
            img.setDrawable(getResources().getDrawable(R.drawable.ic_donar_paypal));
        }else {
            img.setDrawable(getResources().getDrawable(R.drawable.ic_donate_paypal));
        }
        img.setOnItemClickListener(item
                -> Utils.launchUrl("https://www.paypal.me/morogoku", Objects.requireNonNull(getActivity())));

        items.add(img);

    }
}
