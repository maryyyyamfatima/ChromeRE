package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class NW2 {
    public static final AbstractC10422uW2 a;
    public static final AbstractC10422uW2 b;
    public static final AbstractC10422uW2 c;

    static {
        RuntimeException a2;
        AbstractC10422uW2 abstractC10422uW2;
        AbstractC10422uW2 abstractC10422uW22;
        AbstractC10422uW2 abstractC10422uW23;
        MW2 mw2 = new MW2();
        DV0 dv0 = MR2.b;
        if (dv0 == null) {
            abstractC10422uW2 = MR2.a(mw2);
        } else {
            try {
                abstractC10422uW2 = (AbstractC10422uW2) dv0.apply(mw2);
                Q82.a(abstractC10422uW2, "Scheduler Callable result can't be null");
            } finally {
            }
        }
        a = abstractC10422uW2;
        GW2 gw2 = new GW2();
        DV0 dv02 = MR2.a;
        if (dv02 == null) {
            abstractC10422uW22 = MR2.a(gw2);
        } else {
            try {
                abstractC10422uW22 = (AbstractC10422uW2) dv02.apply(gw2);
                Q82.a(abstractC10422uW22, "Scheduler Callable result can't be null");
            } finally {
            }
        }
        b = abstractC10422uW22;
        HW2 hw2 = new HW2();
        DV0 dv03 = MR2.c;
        if (dv03 == null) {
            abstractC10422uW23 = MR2.a(hw2);
        } else {
            try {
                abstractC10422uW23 = (AbstractC10422uW2) dv03.apply(hw2);
                Q82.a(abstractC10422uW23, "Scheduler Callable result can't be null");
            } finally {
            }
        }
        c = abstractC10422uW23;
        int i = RU3.b;
        KW2 kw2 = new KW2();
        DV0 dv04 = MR2.d;
        if (dv04 == null) {
            MR2.a(kw2);
        } else {
            try {
                Q82.a((AbstractC10422uW2) dv04.apply(kw2), "Scheduler Callable result can't be null");
            } finally {
            }
        }
    }
}
