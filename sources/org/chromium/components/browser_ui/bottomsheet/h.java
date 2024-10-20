package org.chromium.components.browser_ui.bottomsheet;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC1996Pj1;
import defpackage.C11939yv1;
import defpackage.DD2;
import defpackage.GD2;
import defpackage.HD2;
import defpackage.ID2;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC4481dC;
import defpackage.JD2;
import defpackage.UX2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ m a;
    public final /* synthetic */ Callback g;
    public final /* synthetic */ Window h;
    public final /* synthetic */ C11939yv1 i;
    public final /* synthetic */ InterfaceC0079Ap3 j;
    public final /* synthetic */ InterfaceC0079Ap3 k;

    public /* synthetic */ h(m mVar, Callback callback, Window window, C11939yv1 c11939yv1, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32) {
        this.a = mVar;
        this.g = callback;
        this.h = window;
        this.i = c11939yv1;
        this.j = interfaceC0079Ap3;
        this.k = interfaceC0079Ap32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final m mVar = this.a;
        mVar.getClass();
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.j;
        ViewGroup viewGroup = (ViewGroup) interfaceC0079Ap3.get();
        mVar.g = viewGroup;
        int i = 0;
        viewGroup.setVisibility(0);
        LayoutInflater.from(((ViewGroup) interfaceC0079Ap3.get()).getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e006f, mVar.g);
        BottomSheet bottomSheet = (BottomSheet) ((ViewGroup) interfaceC0079Ap3.get()).findViewById(R.id.bottom_sheet);
        mVar.a = bottomSheet;
        this.g.onResult(bottomSheet);
        BottomSheet bottomSheet2 = mVar.a;
        bottomSheet2.k = (ViewGroup) bottomSheet2.getParent();
        bottomSheet2.x = (TouchRestrictingFrameLayout) bottomSheet2.findViewById(R.id.bottom_sheet_toolbar_container);
        TouchRestrictingFrameLayout touchRestrictingFrameLayout = (TouchRestrictingFrameLayout) bottomSheet2.findViewById(R.id.bottom_sheet_content);
        bottomSheet2.v = touchRestrictingFrameLayout;
        touchRestrictingFrameLayout.a = bottomSheet2;
        bottomSheet2.n = bottomSheet2.k.getWidth();
        bottomSheet2.o = bottomSheet2.k.getHeight();
        Window window = this.h;
        bottomSheet2.D = window;
        bottomSheet2.E = this.k;
        bottomSheet2.w();
        bottomSheet2.k.addOnLayoutChangeListener(new b(bottomSheet2, window, this.i));
        bottomSheet2.x.addOnLayoutChangeListener(new c(bottomSheet2));
        bottomSheet2.k.removeView(bottomSheet2);
        mVar.a.C = mVar.q;
        mVar.h = new PriorityQueue(1, new Comparator() { // from class: SB
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((PB) obj).a() - ((PB) obj2).a();
            }
        });
        HashMap e = PropertyModel.e(UX2.l);
        ID2 id2 = UX2.a;
        DD2 dd2 = new DD2();
        dd2.a = 0;
        e.put(id2, dd2);
        HD2 hd2 = UX2.b;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(hd2, ad2);
        JD2 jd2 = UX2.c;
        BottomSheet bottomSheet3 = mVar.a;
        GD2 gd2 = new GD2();
        gd2.a = bottomSheet3;
        e.put(jd2, gd2);
        HD2 hd22 = UX2.d;
        AD2 ad22 = new AD2();
        ad22.a = false;
        e.put(hd22, ad22);
        JD2 jd22 = UX2.f;
        Runnable runnable = new Runnable() { // from class: org.chromium.components.browser_ui.bottomsheet.i
            @Override // java.lang.Runnable
            public final void run() {
                BottomSheet bottomSheet4 = m.this.a;
                if (bottomSheet4.z) {
                    bottomSheet4.t(bottomSheet4.i(), 3, true);
                }
            }
        };
        GD2 gd22 = new GD2();
        gd22.a = runnable;
        PropertyModel a = AbstractC1996Pj1.a(e, jd22, gd22, e);
        BottomSheet bottomSheet4 = mVar.a;
        bottomSheet4.g.a(new l(mVar, a));
        while (true) {
            ArrayList arrayList = mVar.l;
            if (i >= arrayList.size()) {
                arrayList.clear();
                mVar.k = null;
                return;
            } else {
                BottomSheet bottomSheet5 = mVar.a;
                bottomSheet5.g.a((InterfaceC4481dC) arrayList.get(i));
                i++;
            }
        }
    }
}
