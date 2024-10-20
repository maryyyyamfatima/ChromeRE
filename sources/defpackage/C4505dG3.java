package defpackage;

import android.app.Activity;
import org.chromium.chrome.features.tasks.TasksView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dG3 */
/* loaded from: classes2.dex */
public final class C4505dG3 implements WF3 {
    public final InterfaceC10318uB3 a;
    public final TasksView b;
    public final C6566jG3 c;
    public final int d;
    public final ViewOnClickListenerC1069If3 e;
    public final Activity f;
    public final InterfaceC0079Ap3 g;
    public final C4941eZ1 h;
    public C4161cG3 i;
    public C3848bM3 j;
    public boolean k;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Type inference failed for: r1v13, types: [ZF3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4505dG3(android.app.Activity r23, defpackage.OX2 r24, org.chromium.ui.modelutil.PropertyModel r25, int r26, defpackage.InterfaceC0079Ap3 r27, boolean r28, boolean r29, org.chromium.ui.base.WindowAndroid r30, defpackage.I5 r31, defpackage.InterfaceC10590uz3 r32, defpackage.ViewOnClickListenerC1069If3 r33, defpackage.InterfaceC0079Ap3 r34, org.chromium.chrome.browser.compositor.layouts.content.TabContentManager r35, defpackage.ZX1 r36, defpackage.JC r37, defpackage.InterfaceC10912vv3 r38, defpackage.InterfaceC9377rT1 r39, defpackage.InterfaceC0079Ap3 r40, defpackage.C7507m02 r41, android.view.ViewGroup r42) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4505dG3.<init>(android.app.Activity, OX2, org.chromium.ui.modelutil.PropertyModel, int, Ap3, boolean, boolean, org.chromium.ui.base.WindowAndroid, I5, uz3, If3, Ap3, org.chromium.chrome.browser.compositor.layouts.content.TabContentManager, ZX1, JC, vv3, rT1, Ap3, m02, android.view.ViewGroup):void");
    }

    public final InterfaceC0079Ap3 a() {
        int i = this.d;
        if (i == 1 || i == 0) {
            return this.a.m();
        }
        return null;
    }

    public final void b(InterfaceC5991hc2 interfaceC5991hc2, OJ0 oj0) {
        InterfaceC10318uB3 interfaceC10318uB3 = this.a;
        if (interfaceC10318uB3 != null) {
            interfaceC10318uB3.a();
        }
        C6566jG3 c6566jG3 = this.c;
        c6566jG3.a = interfaceC5991hc2;
        PD2 pd2 = AbstractC6910kG3.p;
        ViewOnClickListenerC4848eG3 viewOnClickListenerC4848eG3 = new ViewOnClickListenerC4848eG3(c6566jG3);
        PropertyModel propertyModel = c6566jG3.h;
        propertyModel.o(pd2, viewOnClickListenerC4848eG3);
        propertyModel.o(AbstractC6910kG3.q, new C5192fG3(c6566jG3));
        propertyModel.o(AbstractC6910kG3.u, new ViewOnClickListenerC5536gG3(c6566jG3, oj0));
        propertyModel.o(AbstractC6910kG3.r, new ViewOnClickListenerC5880hG3(c6566jG3));
        C6224iG3 c6224iG3 = new C6224iG3(c6566jG3);
        c6566jG3.getClass();
        ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = c6566jG3.g;
        viewOnClickListenerC6375ij1.g.a(c6224iG3);
        propertyModel.o(AbstractC6910kG3.l, viewOnClickListenerC6375ij1);
        propertyModel.o(AbstractC6910kG3.j, viewOnClickListenerC6375ij1);
    }

    public final void c() {
        C4161cG3 c4161cG3 = this.i;
        if (c4161cG3 != null) {
            c4161cG3.a();
            this.i = null;
        }
        C3848bM3 c3848bM3 = this.j;
        if (c3848bM3 != null) {
            c3848bM3.c();
            this.j = null;
        }
        C4941eZ1 c4941eZ1 = this.h;
        if (c4941eZ1 != null) {
            c4941eZ1.a();
            this.k = false;
        }
        this.a.q().o();
    }
}
