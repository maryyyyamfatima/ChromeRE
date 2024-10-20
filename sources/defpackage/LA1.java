package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LA1 extends AA1 {
    public final WeakReference c;
    public IH0 a = new IH0();
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public final ArrayList g = new ArrayList();
    public EnumC11683yA1 b = EnumC11683yA1.INITIALIZED;
    public final boolean h = true;

    public LA1(JA1 ja1) {
        this.c = new WeakReference(ja1);
    }

    public final void e(EnumC11340xA1 enumC11340xA1) {
        d("handleLifecycleEvent");
        f(enumC11340xA1.a());
    }

    public final void f(EnumC11683yA1 enumC11683yA1) {
        EnumC11683yA1 enumC11683yA12 = this.b;
        if (enumC11683yA12 == enumC11683yA1) {
            return;
        }
        EnumC11683yA1 enumC11683yA13 = EnumC11683yA1.INITIALIZED;
        EnumC11683yA1 enumC11683yA14 = EnumC11683yA1.DESTROYED;
        if (enumC11683yA12 == enumC11683yA13 && enumC11683yA1 == enumC11683yA14) {
            throw new IllegalStateException("no event down from " + this.b);
        }
        this.b = enumC11683yA1;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        g();
        this.e = false;
        if (this.b == enumC11683yA14) {
            this.a = new IH0();
        }
    }

    public final EnumC11683yA1 c(IA1 ia1) {
        IH0 ih0 = this.a;
        ET2 et2 = ih0.j.containsKey(ia1) ? ((ET2) ih0.j.get(ia1)).i : null;
        EnumC11683yA1 enumC11683yA1 = et2 != null ? ((KA1) et2.g).a : null;
        ArrayList arrayList = this.g;
        EnumC11683yA1 enumC11683yA12 = arrayList.isEmpty() ? null : (EnumC11683yA1) arrayList.get(arrayList.size() - 1);
        EnumC11683yA1 enumC11683yA13 = this.b;
        if (enumC11683yA1 == null || enumC11683yA1.compareTo(enumC11683yA13) >= 0) {
            enumC11683yA1 = enumC11683yA13;
        }
        return (enumC11683yA12 == null || enumC11683yA12.compareTo(enumC11683yA1) >= 0) ? enumC11683yA1 : enumC11683yA12;
    }

    @Override // defpackage.AA1
    public void a(IA1 ia1) {
        JA1 ja1;
        EnumC11340xA1 enumC11340xA1;
        d("addObserver");
        EnumC11683yA1 enumC11683yA1 = this.b;
        EnumC11683yA1 enumC11683yA12 = EnumC11683yA1.DESTROYED;
        if (enumC11683yA1 != enumC11683yA12) {
            enumC11683yA12 = EnumC11683yA1.INITIALIZED;
        }
        KA1 ka1 = new KA1(ia1, enumC11683yA12);
        if (((KA1) this.a.d(ia1, ka1)) == null && (ja1 = (JA1) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            EnumC11683yA1 c = c(ia1);
            this.d++;
            while (ka1.a.compareTo(c) < 0 && this.a.j.containsKey(ia1)) {
                EnumC11683yA1 enumC11683yA13 = ka1.a;
                ArrayList arrayList = this.g;
                arrayList.add(enumC11683yA13);
                int ordinal = ka1.a.ordinal();
                if (ordinal == 1) {
                    enumC11340xA1 = EnumC11340xA1.ON_CREATE;
                } else if (ordinal == 2) {
                    enumC11340xA1 = EnumC11340xA1.ON_START;
                } else {
                    enumC11340xA1 = ordinal != 3 ? null : EnumC11340xA1.ON_RESUME;
                }
                if (enumC11340xA1 == null) {
                    throw new IllegalStateException("no event up from " + ka1.a);
                }
                ka1.a(ja1, enumC11340xA1);
                arrayList.remove(arrayList.size() - 1);
                c = c(ia1);
            }
            if (!z) {
                g();
            }
            this.d--;
        }
    }

    @Override // defpackage.AA1
    public final void b(IA1 ia1) {
        d("removeObserver");
        this.a.b(ia1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f7, code lost:            continue;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LA1.g():void");
    }

    public final void d(String str) {
        if (this.h) {
            C1604Mj.a().a.getClass();
            if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                throw new IllegalStateException(AbstractC4199cO1.a("Method ", str, " must be called on the main thread"));
            }
        }
    }
}
