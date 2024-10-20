package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IT {
    public static final C3588ad m = new C3588ad("ClearcutLogger.API", new DT(), new C3259Zc());
    public static final String[] n = new String[0];
    public static final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public static volatile int p = -1;
    public final PT a;
    public final Context b;
    public final String c;
    public final EnumSet d;
    public final boolean e;
    public final InterfaceC4576dV f;
    public final GT g;
    public final CopyOnWriteArrayList h;
    public final String i;
    public final String j;
    public final HT k;
    public int l;

    public IT(Context context, String str, String str2) {
        this(context, str, str2, EnumC1717Nf2.i, new OT(context, new InterfaceC0209Bp3() { // from class: JT
            @Override // defpackage.InterfaceC0209Bp3
            public final Object get() {
                return Boolean.FALSE;
            }
        }), new JH1(context));
    }

    public IT(Context context, String str, String str2, EnumSet enumSet, OT ot, JH1 jh1) {
        this.h = new CopyOnWriteArrayList();
        this.l = 1;
        enumSet.contains(EnumC1717Nf2.h);
        b(enumSet);
        this.b = context.getApplicationContext();
        this.c = context.getPackageName();
        this.i = str;
        this.j = str2;
        this.d = enumSet;
        this.e = false;
        this.a = ot;
        this.f = C9808sj0.a;
        this.k = new HT();
        this.l = 1;
        this.g = jh1;
    }

    public static void b(EnumSet enumSet) {
        if (!enumSet.equals(EnumC1717Nf2.k) && !enumSet.equals(EnumC1717Nf2.i) && !enumSet.equals(EnumC1717Nf2.j)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
        }
    }

    public static int[] a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [CT] */
    public final FT c(final QX0 qx0) {
        Objects.requireNonNull(qx0);
        return new FT(this, new InterfaceC0209Bp3() { // from class: CT
            @Override // defpackage.InterfaceC0209Bp3
            public final Object get() {
                return qx0.c();
            }
        });
    }
}
