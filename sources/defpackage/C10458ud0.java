package defpackage;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.ChromeActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ud0 */
/* loaded from: classes.dex */
public final class C10458ud0 implements V02 {
    public final ArrayList a = new ArrayList();
    public final I5 g;
    public final Activity h;
    public final InterfaceC3241Yy1 i;
    public final InterfaceC7697ma2 j;
    public final F20 k;
    public final QS3 l;
    public boolean m;

    public C10458ud0(I5 i5, Activity activity, InterfaceC3241Yy1 interfaceC3241Yy1, InterfaceC7697ma2 interfaceC7697ma2, F20 f20, QS3 qs3) {
        this.g = i5;
        this.h = activity;
        this.i = interfaceC3241Yy1;
        this.j = interfaceC7697ma2;
        this.k = f20;
        this.l = qs3;
        i5.b(this);
    }

    @Override // defpackage.V02
    public final void U() {
        Activity activity = this.h;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        C9897sy1 c9897sy1 = new C9897sy1((InterfaceC7839my1) this.i.get(), viewGroup, this.j, new InterfaceC0079Ap3() { // from class: td0
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C10458ud0.this.l;
            }
        });
        ((ChromeActivity) this.k).x1(c9897sy1, activity.findViewById(com.android.chrome.R.id.url_bar), viewGroup, (B80) activity.findViewById(com.android.chrome.R.id.control_container));
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Callback) it.next()).onResult(c9897sy1);
        }
        this.m = true;
        arrayList.clear();
        this.g.c(this);
    }
}
