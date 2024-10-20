package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yT */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11776yT implements Runnable {
    public final /* synthetic */ BT a;
    public final /* synthetic */ CS g;
    public final /* synthetic */ int h;
    public final /* synthetic */ C2264Rl i;
    public final /* synthetic */ MU j;
    public final /* synthetic */ int k;

    public /* synthetic */ RunnableC11776yT(BT bt, CS cs, int i, C2264Rl c2264Rl, MU mu, int i2) {
        this.a = bt;
        this.g = cs;
        this.h = i;
        this.i = c2264Rl;
        this.j = mu;
        this.k = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final BT bt = this.a;
        WB2 wb2 = bt.b;
        ((NJ0) wb2).getClass();
        EI2.b("ContentSuggestions.Feed.VisibilityLoggingEnabled", true);
        InterfaceC5462g31 interfaceC5462g31 = (InterfaceC5462g31) BT.e.b().g("com/google/chrome/elements/ve/ClearcutLogSender", 119, "sendAsyncImpl", "ClearcutLogSender.java");
        CS cs = this.g;
        C2404Sn c2404Sn = cs.a;
        String str = c2404Sn.a;
        String str2 = c2404Sn.b;
        int[] iArr = bt.d;
        int i = this.h;
        Integer valueOf = Integer.valueOf(i);
        final int i2 = this.k;
        interfaceC5462g31.m(str, str2, iArr, valueOf, Integer.valueOf(i2));
        SN sn = (SN) TN.p.j();
        C2404Sn c2404Sn2 = cs.a;
        String str3 = c2404Sn2.b;
        if (sn.h) {
            sn.l();
            sn.h = false;
        }
        TN tn = (TN) sn.g;
        tn.getClass();
        str3.getClass();
        tn.j |= 1;
        tn.k = str3;
        C7290lO c7290lO = (C7290lO) C8665pO.n.j();
        wb2.getClass();
        if (c7290lO.h) {
            c7290lO.l();
            c7290lO.h = false;
        }
        C8665pO c8665pO = (C8665pO) c7290lO.g;
        c8665pO.getClass();
        c8665pO.j = 1 | c8665pO.j;
        c8665pO.k = "105.0.5195.136";
        int a = AbstractC7978nO.a(4);
        if (c7290lO.h) {
            c7290lO.l();
            c7290lO.h = false;
        }
        C8665pO c8665pO2 = (C8665pO) c7290lO.g;
        c8665pO2.getClass();
        c8665pO2.l = AbstractC2373Sg3.b(a);
        c8665pO2.j |= 2;
        if (c7290lO.h) {
            c7290lO.l();
            c7290lO.h = false;
        }
        C8665pO c8665pO3 = (C8665pO) c7290lO.g;
        c8665pO3.getClass();
        c8665pO3.m = 5;
        c8665pO3.j |= 4;
        if (sn.h) {
            sn.l();
            sn.h = false;
        }
        TN tn2 = (TN) sn.g;
        C8665pO c8665pO4 = (C8665pO) c7290lO.j();
        tn2.getClass();
        c8665pO4.getClass();
        tn2.m = c8665pO4;
        tn2.j = 4 | tn2.j;
        C2264Rl c2264Rl = this.i;
        if (c2264Rl != null) {
            if (sn.h) {
                sn.l();
                sn.h = false;
            }
            TN tn3 = (TN) sn.g;
            tn3.getClass();
            tn3.l = c2264Rl;
            tn3.j |= 2;
        }
        AT at = bt.a;
        at.getClass();
        String str4 = c2404Sn2.a;
        if (AbstractC2442Su2.a(str4)) {
            str4 = null;
        }
        FT c = new IT(at.a, at.b, str4).c(sn.j());
        WT wt = c.c;
        if (wt.h) {
            wt.l();
            wt.h = false;
        }
        YT yt = (YT) wt.g;
        yt.k |= 16;
        yt.o = i;
        c.a(bt.d);
        MU mu = this.j;
        if (mu != null) {
            c.e = mu;
        }
        c.c().l(new RP2() { // from class: zT
            @Override // defpackage.RP2
            public final void c(QP2 qp2) {
                Status status = (Status) qp2;
                BT bt2 = BT.this;
                bt2.getClass();
                status.getClass();
                boolean r1 = status.r1();
                ((NJ0) bt2.b).getClass();
                int i3 = i2;
                if (i3 == 1) {
                    EI2.b("ContentSuggestions.Feed.UploadVisibilityLog.View", r1);
                } else if (i3 == 2) {
                    EI2.b("ContentSuggestions.Feed.UploadVisibilityLog.Click", r1);
                }
                EI2.b("ContentSuggestions.Feed.UploadVisibilityLog", r1);
            }
        });
    }
}
