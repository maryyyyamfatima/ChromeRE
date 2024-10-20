package org.chromium.chrome.browser.search_engines.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.chrome.R;
import defpackage.EC1;
import defpackage.IG3;
import defpackage.IZ2;
import org.chromium.base.ThreadUtils;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchEngineSettings extends EC1 {
    public IZ2 k0;

    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        getActivity().setTitle(R.string.f85690_resource_name_obfuscated_res_0x7f1409cd);
        O0();
        M0(this.k0);
    }

    public final void O0() {
        if (this.k0 != null) {
            return;
        }
        this.k0 = new IZ2(getActivity());
    }

    @Override // defpackage.EC1, androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        L0();
        L0();
        ListView listView = this.f0;
        listView.setDivider(null);
        listView.setItemsCanFocus(true);
    }

    @Override // androidx.fragment.app.c
    public final void t0() {
        this.f11484J = true;
        IZ2 iz2 = this.k0;
        iz2.c();
        IG3.a().a(iz2);
    }

    @Override // androidx.fragment.app.c
    public final void u0() {
        this.f11484J = true;
        IZ2 iz2 = this.k0;
        if (iz2.l) {
            TemplateUrlService a = IG3.a();
            a.getClass();
            Object obj = ThreadUtils.a;
            a.a.d(iz2);
            iz2.l = false;
        }
        IG3.a().h(iz2);
    }
}
