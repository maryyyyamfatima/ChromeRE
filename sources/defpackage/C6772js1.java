package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tasks.tab_management.TabGridIphDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: js1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6772js1 extends KV1 {
    public final C8174nw3 c;
    public final KU3 d;
    public final C5398fs1 e;

    /* JADX WARN: Type inference failed for: r0v1, types: [fs1] */
    public C6772js1(C8174nw3 c8174nw3) {
        super(2);
        this.e = new Callback() { // from class: fs1
            /* JADX WARN: Type inference failed for: r1v1, types: [gs1] */
            /* JADX WARN: Type inference failed for: r2v0, types: [hs1] */
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final C6772js1 c6772js1 = C6772js1.this;
                if (c6772js1.d.wouldTriggerHelpUI("IPH_TabGroupsDragAndDrop")) {
                    c6772js1.c(new C6429is1(new TU1() { // from class: gs1
                        @Override // defpackage.TU1
                        public final void a() {
                            C8174nw3 c8174nw32 = C6772js1.this.c;
                            c8174nw32.d.l(c8174nw32.c, 1, false);
                            TabGridIphDialogView tabGridIphDialogView = c8174nw32.b;
                            tabGridIphDialogView.a();
                            C6674jc.c(tabGridIphDialogView.m, tabGridIphDialogView.o);
                            tabGridIphDialogView.n.start();
                        }
                    }, new RU1() { // from class: hs1
                        @Override // defpackage.RU1
                        public final void a(int i) {
                            KU3 ku3 = C6772js1.this.d;
                            ku3.shouldTriggerHelpUI("IPH_TabGroupsDragAndDrop");
                            ku3.dismissed("IPH_TabGroupsDragAndDrop");
                        }
                    }));
                }
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        };
        this.c = c8174nw3;
        Profile d = Profile.d();
        this.d = LU3.a((Profile) N.MD_ez$kP(d.b, d));
    }

    @Override // defpackage.KV1
    public final void a(QU1 qu1) {
        super.a(qu1);
        this.d.d(this.e);
    }
}
