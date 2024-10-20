package defpackage;

import android.app.Activity;
import androidx.appcompat.app.a;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.tablet.emptybackground.EmptyBackgroundViewTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cA0 */
/* loaded from: classes2.dex */
public final class C4128cA0 {
    public final Activity a;
    public final InterfaceC10590uz3 b;
    public final AbstractC10569uv3 c;
    public final C3375Zz0 d;
    public final C3441aA0 e;
    public final ViewOnClickListenerC1069If3 f;
    public C4496dF g;
    public InterfaceC10240ty1 h;
    public EmptyBackgroundViewTablet i;
    public final InterfaceC0950Hi j;

    public C4128cA0(InterfaceC10590uz3 interfaceC10590uz3, AbstractC10569uv3 abstractC10569uv3, a aVar, C1340Ki c1340Ki, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, C8385oa2 c8385oa2) {
        C4496dF c4496dF = new C4496dF();
        this.g = c4496dF;
        this.a = aVar;
        this.j = c1340Ki;
        this.b = interfaceC10590uz3;
        this.c = abstractC10569uv3;
        this.f = viewOnClickListenerC1069If3;
        c8385oa2.m(c4496dF.b(new Callback() { // from class: Yz0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4128cA0.this.h = (InterfaceC10240ty1) obj;
            }
        }));
        this.d = new C3375Zz0(this);
        this.e = new C3441aA0(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f9, code lost:            if (r3 != r4) goto L250;     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.C4128cA0 r8) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4128cA0.a(cA0):void");
    }
}
