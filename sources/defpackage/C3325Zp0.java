package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zp0 */
/* loaded from: classes2.dex */
public final class C3325Zp0 implements InterfaceC1621Mm1 {
    public Window a;
    public int g = 0;
    public C1751Nm1 h;
    public InterfaceC7697ma2 i;
    public C3195Yp0 j;
    public final C4011bq0 k;

    @Override // defpackage.InterfaceC1621Mm1
    public final void d() {
    }

    public final void b() {
        InterfaceC7697ma2 interfaceC7697ma2;
        C4011bq0 c4011bq0 = this.k;
        Activity activity = (Activity) c4011bq0.a.m().k().get();
        if (activity == null) {
            return;
        }
        Tab tab = c4011bq0.a;
        WindowAndroid m = tab.m();
        InterfaceC7697ma2 interfaceC7697ma22 = null;
        if (m != null) {
            interfaceC7697ma2 = (InterfaceC7697ma2) C1881Om1.k.e(m.t);
        } else {
            K14 k14 = C1881Om1.k;
            interfaceC7697ma2 = null;
        }
        C1751Nm1 c1751Nm1 = interfaceC7697ma2 == null ? null : (C1751Nm1) ((C8385oa2) interfaceC7697ma2).g;
        C1751Nm1 c1751Nm12 = this.h;
        if (c1751Nm12 != c1751Nm1) {
            if (c1751Nm12 != null) {
                c1751Nm12.g.d(this);
            }
            this.h = c1751Nm1;
            if (c1751Nm1 != null) {
                c1751Nm1.g.a(this);
            }
        }
        WindowAndroid m2 = tab.m();
        if (m2 != null) {
            K14 k142 = E5.k;
            interfaceC7697ma22 = (InterfaceC7697ma2) E5.k.e(m2.t);
        }
        e(interfaceC7697ma22);
        this.a = activity.getWindow();
    }

    @Override // defpackage.InterfaceC1621Mm1
    public final void a(Rect rect) {
        C4011bq0 c4011bq0 = this.k;
        WebContents b = c4011bq0.a.b();
        if (b == null) {
            return;
        }
        float f = c4011bq0.a.b().Q0().i.d;
        rect.set((int) Math.ceil(rect.left / f), (int) Math.ceil(rect.top / f), (int) Math.ceil(rect.right / f), (int) Math.ceil(rect.bottom / f));
        b.m0(rect);
    }

    public C3325Zp0(C4011bq0 c4011bq0) {
        this.k = c4011bq0;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [Yp0, org.chromium.base.Callback] */
    public final void e(InterfaceC7697ma2 interfaceC7697ma2) {
        InterfaceC7697ma2 interfaceC7697ma22 = this.i;
        if (interfaceC7697ma22 == interfaceC7697ma2) {
            return;
        }
        C3195Yp0 c3195Yp0 = this.j;
        if (c3195Yp0 != null) {
            ((C8385oa2) interfaceC7697ma22).n(c3195Yp0);
        }
        this.i = interfaceC7697ma2;
        this.j = null;
        if (interfaceC7697ma2 != null) {
            ?? r0 = new Callback() { // from class: Yp0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C3325Zp0.this.c();
                }
            };
            this.j = r0;
            ((C8385oa2) interfaceC7697ma2).m(r0);
        }
    }

    public final void c() {
        int intValue;
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        Window window = this.a;
        WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
        if (attributes == null) {
            return;
        }
        int i = 0;
        if (this.k.a.isUserInteractable()) {
            InterfaceC7697ma2 interfaceC7697ma2 = this.i;
            if (interfaceC7697ma2 == null || (intValue = ((Integer) ((C8385oa2) interfaceC7697ma2).g).intValue()) == 0) {
                int i2 = this.g;
                if (i2 == 1) {
                    i = 2;
                } else if (i2 == 2 || i2 == 3) {
                    i = 1;
                }
            } else {
                i = intValue;
            }
        }
        if (attributes.layoutInDisplayCutoutMode == i) {
            return;
        }
        attributes.layoutInDisplayCutoutMode = i;
        this.a.setAttributes(attributes);
    }
}
