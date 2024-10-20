package org.chromium.chrome.browser.language.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.A50;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC8305oK2;
import defpackage.C10536uq0;
import defpackage.C1812Ny2;
import defpackage.C9549rx1;
import defpackage.E23;
import defpackage.LN3;
import org.chromium.chrome.browser.language.settings.ContentLanguagesPreference;
import org.chromium.chrome.browser.language.settings.LanguageSettings;
import org.chromium.chrome.browser.language.settings.SelectLanguageFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContentLanguagesPreference extends Preference {
    public TextView T;
    public RecyclerView U;
    public final A50 V;
    public E23 W;

    public ContentLanguagesPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = new A50(context);
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.T = (TextView) c1812Ny2.v(R.id.add_language);
        Context context = this.a;
        LN3 b = LN3.b(context, R.drawable.0_resource_name_obfuscated_res_0x7f090409);
        b.setTint(AbstractC10957w33.b(context));
        this.T.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
        this.T.setOnClickListener(new View.OnClickListener() { // from class: x50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageSettings languageSettings = (LanguageSettings) ContentLanguagesPreference.this.W;
                languageSettings.getClass();
                C9549rx1.h(1);
                Intent e = languageSettings.j0.e(languageSettings.getActivity(), SelectLanguageFragment.class.getName());
                e.putExtra("SelectLanguageFragment.PotentialLanguages", 0);
                languageSettings.startActivityForResult(e, 1);
            }
        });
        this.U = (RecyclerView) c1812Ny2.v(R.id.language_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.U.q0(linearLayoutManager);
        if (this.U.v.size() == 0) {
            this.U.g(new C10536uq0(context, linearLayoutManager.p));
        }
        RecyclerView recyclerView = this.U;
        AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
        A50 a50 = this.V;
        if (abstractC8305oK2 != a50) {
            recyclerView.n0(a50);
            C9549rx1.b().b = a50;
            a50.S();
        }
    }
}
