package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FF2 extends DialogFragment {
    public WindowAndroid a;
    public ArrayList g;
    public C1419Kx3 h;

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1419Kx3 c1419Kx3 = this.h;
        ((GF2) c1419Kx3.d.get(c1419Kx3.e)).onResume();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        Iterator it = this.h.d.iterator();
        while (it.hasNext()) {
            ((GF2) it.next()).onPause();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((GF2) it.next()).onDestroy();
        }
        this.g.clear();
        this.a = null;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.a == null || this.h == null) {
            onDestroyView();
        }
    }

    public final void a(WindowAndroid windowAndroid) {
        this.a = windowAndroid;
        C1419Kx3 c1419Kx3 = this.h;
        if (c1419Kx3 != null) {
            Iterator it = c1419Kx3.d.iterator();
            while (it.hasNext()) {
                ((GF2) it.next()).b(windowAndroid);
            }
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        YF2 yf2 = new YF2(activity, new Runnable() { // from class: DF2
            public /* synthetic */ DF2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FF2.this.dismiss();
            }
        }, getArguments().getString("url_key"), this.a);
        KF2 kf2 = new KF2(activity, new EF2(this), this.a);
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.add(yf2);
        this.g.add(kf2);
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0233, (ViewGroup) null);
        ((ChromeImageButton) inflate.findViewById(R.id.close_button)).setOnClickListener(new View.OnClickListener() { // from class: CF2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FF2.this.dismiss();
            }
        });
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            arrayList2.add(((GF2) it.next()).a());
        }
        HF2 hf2 = new HF2(arrayList2);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.qrcode_view_pager);
        viewPager.v(hf2);
        C1419Kx3 c1419Kx3 = new C1419Kx3(tabLayout, this.g);
        this.h = c1419Kx3;
        viewPager.b(c1419Kx3);
        tabLayout.b(new C0769Fx3(viewPager));
        c5490g8.a.q = inflate;
        return c5490g8.a();
    }
}
