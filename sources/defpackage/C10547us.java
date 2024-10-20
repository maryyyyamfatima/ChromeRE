package defpackage;

import androidx.fragment.app.c;
import androidx.fragment.app.h;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: us */
/* loaded from: classes.dex */
public final class C10547us implements InterfaceC10405uT0 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public final h q;
    public boolean r;
    public int s;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void h(String str, PrintWriter printWriter) {
        String str2;
        printWriter.print(str);
        printWriter.print("mName=");
        printWriter.print(this.i);
        printWriter.print(" mIndex=");
        printWriter.print(this.s);
        printWriter.print(" mCommitted=");
        printWriter.println(this.r);
        if (this.f != 0) {
            printWriter.print(str);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString(this.f));
        }
        if (this.b != 0 || this.c != 0) {
            printWriter.print(str);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString(this.b));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString(this.c));
        }
        if (this.d != 0 || this.e != 0) {
            printWriter.print(str);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString(this.d));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString(this.e));
        }
        if (this.j != 0 || this.k != null) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString(this.j));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println(this.k);
        }
        if (this.l != 0 || this.m != null) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString(this.l));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println(this.m);
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TT0 tt0 = (TT0) arrayList.get(i);
            switch (tt0.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + tt0.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(tt0.b);
            if (tt0.d != 0 || tt0.e != 0) {
                printWriter.print(str);
                printWriter.print("enterAnim=#");
                printWriter.print(Integer.toHexString(tt0.d));
                printWriter.print(" exitAnim=#");
                printWriter.println(Integer.toHexString(tt0.e));
            }
            if (tt0.f != 0 || tt0.g != 0) {
                printWriter.print(str);
                printWriter.print("popEnterAnim=#");
                printWriter.print(Integer.toHexString(tt0.f));
                printWriter.print(" popExitAnim=#");
                printWriter.println(Integer.toHexString(tt0.g));
            }
        }
    }

    public C10547us(h hVar) {
        hVar.E();
        US0 us0 = hVar.u;
        if (us0 != null) {
            us0.g.getClassLoader();
        }
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
        this.s = -1;
        this.q = hVar;
    }

    public final void b(TT0 tt0) {
        this.a.add(tt0);
        tt0.d = this.b;
        tt0.e = this.c;
        tt0.f = this.d;
        tt0.g = this.e;
    }

    public final void i(c cVar) {
        h hVar = cVar.x;
        if (hVar != null && hVar != this.q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + cVar.toString() + " is already attached to a FragmentManager.");
        }
        b(new TT0(3, cVar));
    }

    public final void k(c cVar, EnumC11683yA1 enumC11683yA1) {
        h hVar = cVar.x;
        h hVar2 = this.q;
        if (hVar != hVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + hVar2);
        }
        if (enumC11683yA1 == EnumC11683yA1.INITIALIZED && cVar.a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC11683yA1 + " after the Fragment has been created");
        }
        if (enumC11683yA1 == EnumC11683yA1.DESTROYED) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC11683yA1 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        b(new TT0(cVar, enumC11683yA1));
    }

    public final void d(int i) {
        if (this.g) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = ((TT0) arrayList.get(i2)).b;
                if (cVar != null) {
                    cVar.w += i;
                }
            }
        }
    }

    public final void g(int i, c cVar, String str, int i2) {
        String str2 = cVar.S;
        if (str2 != null) {
            RT0.c(cVar, str2);
        }
        Class<?> cls = cVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = cVar.D;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(cVar);
                sb.append(": was ");
                throw new IllegalStateException(AbstractC10204ts.a(sb, cVar.D, " now ", str));
            }
            cVar.D = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + cVar + " with tag " + str + " to container view with no id");
            }
            int i3 = cVar.B;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + cVar + ": was " + cVar.B + " now " + i);
            }
            cVar.B = i;
            cVar.C = i;
        }
        b(new TT0(i2, cVar));
        cVar.x = this.q;
    }

    public final int e(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        this.r = true;
        boolean z2 = this.g;
        h hVar = this.q;
        if (z2) {
            this.s = hVar.i.getAndIncrement();
        } else {
            this.s = -1;
        }
        hVar.u(this, z);
        return this.s;
    }

    @Override // defpackage.InterfaceC10405uT0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        h hVar = this.q;
        if (hVar.d == null) {
            hVar.d = new ArrayList();
        }
        hVar.d.add(this);
        return true;
    }

    public final void j(int i, c cVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        g(i, cVar, str, 2);
    }

    public final void c() {
        if (!this.h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.g = true;
        this.i = null;
    }

    public final void f() {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.h = false;
        this.q.x(this, false);
    }
}
