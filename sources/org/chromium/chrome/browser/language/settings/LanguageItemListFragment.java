package org.chromium.chrome.browser.language.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AT0;
import defpackage.AbstractC10957w33;
import defpackage.C10536uq0;
import defpackage.C11602xw1;
import defpackage.InterfaceC11945yw1;
import defpackage.K53;
import defpackage.LN3;
import org.chromium.chrome.browser.language.settings.LanguageItemListFragment;
import org.chromium.chrome.browser.language.settings.SelectLanguageFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LanguageItemListFragment extends c implements AT0 {
    public static final /* synthetic */ int e0 = 0;
    public SettingsLauncher b0;
    public C11602xw1 c0;
    public InterfaceC11945yw1 d0;

    public abstract String L0(Context context);

    public abstract int M0();

    public abstract InterfaceC11945yw1 N0();

    public abstract void O0(String str);

    public abstract void P0(String str);

    public abstract void Q0();

    public abstract void R0();

    public abstract void S0();

    public abstract void T0();

    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        this.d0 = N0();
        getActivity().setTitle(L0(K()));
        S0();
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e015d, viewGroup, false);
        Activity activity = getActivity();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.language_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        recyclerView.q0(linearLayoutManager);
        recyclerView.g(new C10536uq0(activity, linearLayoutManager.p));
        C11602xw1 c11602xw1 = new C11602xw1(this, activity);
        this.c0 = c11602xw1;
        recyclerView.n0(c11602xw1);
        C11602xw1 c11602xw12 = this.c0;
        c11602xw12.R(c11602xw12.r.d0.b());
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.scroll_view);
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new K53(scrollView, inflate.findViewById(R.id.shadow)));
        TextView textView = (TextView) inflate.findViewById(R.id.add_language);
        LN3 b = LN3.b(K(), R.drawable.0_resource_name_obfuscated_res_0x7f090409);
        b.setTint(AbstractC10957w33.b(K()));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: uw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = LanguageItemListFragment.e0;
                LanguageItemListFragment languageItemListFragment = LanguageItemListFragment.this;
                languageItemListFragment.R0();
                Intent e = languageItemListFragment.b0.e(languageItemListFragment.getActivity(), SelectLanguageFragment.class.getName());
                e.putExtra("SelectLanguageFragment.PotentialLanguages", languageItemListFragment.M0());
                languageItemListFragment.startActivityForResult(e, 1);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public final void d0(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            O0(intent.getStringExtra("SelectLanguageFragment.SelectedLanguage"));
            C11602xw1 c11602xw1 = this.c0;
            c11602xw1.R(c11602xw1.r.d0.b());
            Q0();
        }
    }

    @Override // defpackage.AT0
    public final void f(SettingsLauncher settingsLauncher) {
        this.b0 = settingsLauncher;
    }
}
