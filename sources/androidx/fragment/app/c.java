package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.IntentSenderRequest;
import com.android.chrome.R;
import defpackage.AbstractC0087Ar1;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC7328lV2;
import defpackage.AbstractC7848n0;
import defpackage.C10074tV2;
import defpackage.C10462ud4;
import defpackage.C11491xd4;
import defpackage.C11834yd4;
import defpackage.C1593Mg3;
import defpackage.C4788e53;
import defpackage.C7321lU0;
import defpackage.C8348oT0;
import defpackage.C9731sV2;
import defpackage.D5;
import defpackage.E02;
import defpackage.EnumC11683yA1;
import defpackage.G02;
import defpackage.InterfaceC10417uV2;
import defpackage.InterfaceC12177zd4;
import defpackage.InterfaceC3762b61;
import defpackage.JA1;
import defpackage.JS0;
import defpackage.KS0;
import defpackage.LA1;
import defpackage.LS0;
import defpackage.NS0;
import defpackage.OS0;
import defpackage.PT0;
import defpackage.QE1;
import defpackage.QT0;
import defpackage.RT0;
import defpackage.US0;
import defpackage.UY0;
import defpackage.VS0;
import defpackage.VY0;
import defpackage.X5;
import defpackage.Y50;
import defpackage.Z43;
import defpackage.ZS0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class c implements ComponentCallbacks, View.OnCreateContextMenuListener, JA1, InterfaceC12177zd4, InterfaceC3762b61, InterfaceC10417uV2 {
    public static final Object a0 = new Object();
    public c A;
    public int B;
    public int C;
    public String D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: J */
    public boolean f11484J;
    public ViewGroup K;
    public View L;
    public boolean M;
    public NS0 O;
    public boolean P;
    public LayoutInflater Q;
    public boolean R;
    public String S;
    public LA1 U;
    public C7321lU0 V;
    public C10074tV2 X;
    public final ArrayList Y;
    public final JS0 Z;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Boolean j;
    public Bundle l;
    public c m;
    public int o;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public h x;
    public US0 y;
    public int a = -1;
    public String k = UUID.randomUUID().toString();
    public String n = null;
    public Boolean p = null;
    public h z = new h();
    public boolean I = true;
    public boolean N = true;
    public EnumC11683yA1 T = EnumC11683yA1.RESUMED;
    public final G02 W = new G02();

    public void d0(int i, int i2, Intent intent) {
    }

    public void h0(Menu menu, MenuInflater menuInflater) {
    }

    public View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public boolean o0(MenuItem menuItem) {
        return false;
    }

    public void q0(Menu menu) {
    }

    public void s0(Bundle bundle) {
    }

    public void v0(View view, Bundle bundle) {
    }

    public Activity getActivity() {
        for (Context K = K(); K instanceof ContextWrapper; K = ((ContextWrapper) K).getBaseContext()) {
            if (K instanceof Activity) {
                return (Activity) K;
            }
        }
        return null;
    }

    @Override // defpackage.JA1
    public final LA1 Z() {
        return this.U;
    }

    @Override // defpackage.InterfaceC12177zd4
    public final C11834yd4 w() {
        if (this.x == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (L() != 1) {
            HashMap hashMap = this.x.M.j;
            C11834yd4 c11834yd4 = (C11834yd4) hashMap.get(this.k);
            if (c11834yd4 != null) {
                return c11834yd4;
            }
            C11834yd4 c11834yd42 = new C11834yd4();
            hashMap.put(this.k, c11834yd42);
            return c11834yd42;
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final int L() {
        EnumC11683yA1 enumC11683yA1 = this.T;
        if (enumC11683yA1 == EnumC11683yA1.INITIALIZED || this.A == null) {
            return enumC11683yA1.ordinal();
        }
        return Math.min(enumC11683yA1.ordinal(), this.A.L());
    }

    @Override // defpackage.InterfaceC3762b61
    public final E02 r() {
        Application application;
        Context applicationContext = B0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        E02 e02 = new E02();
        LinkedHashMap linkedHashMap = e02.a;
        if (application != null) {
            linkedHashMap.put(C10462ud4.a, application);
        }
        linkedHashMap.put(AbstractC7328lV2.a, this);
        linkedHashMap.put(AbstractC7328lV2.b, this);
        Bundle bundle = this.l;
        if (bundle != null) {
            linkedHashMap.put(AbstractC7328lV2.c, bundle);
        }
        return e02;
    }

    @Override // defpackage.InterfaceC10417uV2
    public final C9731sV2 A() {
        return this.X.b;
    }

    public c() {
        new AtomicInteger();
        this.Y = new ArrayList();
        this.Z = new JS0(this);
        T();
    }

    public final void T() {
        this.U = new LA1(this);
        this.X = new C10074tV2(this);
        ArrayList arrayList = this.Y;
        JS0 js0 = this.Z;
        if (arrayList.contains(js0)) {
            return;
        }
        if (this.a >= 0) {
            c cVar = js0.a;
            cVar.X.a();
            AbstractC7328lV2.a(cVar);
            return;
        }
        arrayList.add(js0);
    }

    public static c V(Context context, String str, Bundle bundle) {
        try {
            c cVar = (c) C8348oT0.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(cVar.getClass().getClassLoader());
                cVar.E0(bundle);
            }
            return cVar;
        } catch (IllegalAccessException e) {
            throw new OS0(AbstractC4199cO1.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new OS0(AbstractC4199cO1.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new OS0(AbstractC4199cO1.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new OS0(AbstractC4199cO1.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final boolean Y() {
        return this.w > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.k);
        if (this.B != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.B));
        }
        if (this.D != null) {
            sb.append(" tag=");
            sb.append(this.D);
        }
        sb.append(")");
        return sb.toString();
    }

    public void E0(Bundle bundle) {
        h hVar = this.x;
        if (hVar != null) {
            if (hVar == null ? false : hVar.J()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.l = bundle;
    }

    public final Bundle A0() {
        Bundle bundle = this.l;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(KS0.a("Fragment ", this, " does not have any arguments."));
    }

    public final Bundle getArguments() {
        return this.l;
    }

    public final void H0(int i, c cVar) {
        if (cVar != null) {
            QT0 qt0 = RT0.a;
            Z43 z43 = new Z43(this, cVar, i);
            QT0 a = RT0.a(this);
            if (a.a.contains(PT0.DETECT_TARGET_FRAGMENT_USAGE) && RT0.d(a, getClass(), Z43.class)) {
                RT0.b(a, z43);
            }
        }
        h hVar = this.x;
        h hVar2 = cVar != null ? cVar.x : null;
        if (hVar != null && hVar2 != null && hVar != hVar2) {
            throw new IllegalArgumentException(KS0.a("Fragment ", cVar, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.R(false)) {
            if (cVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + cVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (cVar == null) {
            this.n = null;
            this.m = null;
        } else if (this.x != null && cVar.x != null) {
            this.n = cVar.k;
            this.m = null;
        } else {
            this.n = null;
            this.m = cVar;
        }
        this.o = i;
    }

    public final c R(boolean z) {
        String str;
        if (z) {
            QT0 qt0 = RT0.a;
            VY0 vy0 = new VY0(this);
            QT0 a = RT0.a(this);
            if (a.a.contains(PT0.DETECT_TARGET_FRAGMENT_USAGE) && RT0.d(a, getClass(), VY0.class)) {
                RT0.b(a, vy0);
            }
        }
        c cVar = this.m;
        if (cVar != null) {
            return cVar;
        }
        h hVar = this.x;
        if (hVar == null || (str = this.n) == null) {
            return null;
        }
        return hVar.z(str);
    }

    public final int S() {
        QT0 qt0 = RT0.a;
        UY0 uy0 = new UY0(this);
        QT0 a = RT0.a(this);
        if (a.a.contains(PT0.DETECT_TARGET_FRAGMENT_USAGE) && RT0.d(a, getClass(), UY0.class)) {
            RT0.b(a, uy0);
        }
        return this.o;
    }

    public final Context K() {
        US0 us0 = this.y;
        if (us0 == null) {
            return null;
        }
        return us0.g;
    }

    public final Context B0() {
        Context K = K();
        if (K != null) {
            return K;
        }
        throw new IllegalStateException(KS0.a("Fragment ", this, " not attached to a context."));
    }

    public final Activity z0() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(KS0.a("Fragment ", this, " not attached to an activity."));
    }

    public final Resources N() {
        return B0().getResources();
    }

    public final String O(int i) {
        return N().getString(i);
    }

    public final String Q(int i, Object... objArr) {
        return N().getString(i, objArr);
    }

    public final h M() {
        h hVar = this.x;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException(KS0.a("Fragment ", this, " not associated with a fragment manager."));
    }

    public final h J() {
        if (this.y == null) {
            throw new IllegalStateException(KS0.a("Fragment ", this, " has not been attached yet."));
        }
        return this.z;
    }

    public final boolean W() {
        return this.y != null && this.q;
    }

    public final boolean a0() {
        return this.a >= 7;
    }

    public final boolean b0() {
        View view;
        return (!W() || X() || (view = this.L) == null || view.getWindowToken() == null || this.L.getVisibility() != 0) ? false : true;
    }

    public final boolean X() {
        if (!this.E) {
            h hVar = this.x;
            if (hVar == null) {
                return false;
            }
            c cVar = this.A;
            hVar.getClass();
            if (!(cVar == null ? false : cVar.X())) {
                return false;
            }
        }
        return true;
    }

    public final void F0() {
        if (!this.H) {
            this.H = true;
            if (!W() || X()) {
                return;
            }
            this.y.j.invalidateOptionsMenu();
        }
    }

    public final void G0(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (this.H && W() && !X()) {
                this.y.j.invalidateOptionsMenu();
            }
        }
    }

    public void I0(boolean z) {
        QT0 qt0 = RT0.a;
        C4788e53 c4788e53 = new C4788e53(this, z);
        QT0 a = RT0.a(this);
        if (a.a.contains(PT0.DETECT_SET_USER_VISIBLE_HINT) && RT0.d(a, getClass(), C4788e53.class)) {
            RT0.b(a, c4788e53);
        }
        if (!this.N && z && this.a < 5 && this.x != null && W() && this.R) {
            h hVar = this.x;
            hVar.M(hVar.e(this));
        }
        this.N = z;
        this.M = this.a < 5 && !z;
        if (this.g != null) {
            this.j = Boolean.valueOf(z);
        }
    }

    public final void J0(Intent intent) {
        US0 us0 = this.y;
        if (us0 != null) {
            Object obj = Y50.a;
            us0.g.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException(KS0.a("Fragment ", this, " not attached to Activity"));
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.y == null) {
            throw new IllegalStateException(KS0.a("Fragment ", this, " not attached to Activity"));
        }
        h M = M();
        if (M.A != null) {
            M.D.addLast(new FragmentManager$LaunchedFragmentInfo(this.k, i));
            M.A.a(intent);
        } else {
            US0 us0 = M.u;
            us0.getClass();
            if (i != -1) {
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
            Object obj = Y50.a;
            us0.g.startActivity(intent, null);
        }
    }

    public final void K0(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.y == null) {
            throw new IllegalStateException(KS0.a("Fragment ", this, " not attached to Activity"));
        }
        h M = M();
        if (M.B != null) {
            IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, null, 0, 0);
            M.D.addLast(new FragmentManager$LaunchedFragmentInfo(this.k, i));
            M.B.a(intentSenderRequest);
            return;
        }
        US0 us0 = M.u;
        if (i == -1) {
            Activity activity = us0.a;
            int i5 = D5.c;
            activity.startIntentSenderForResult(intentSender, i, null, 0, 0, 0, null);
            return;
        }
        us0.getClass();
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public final LayoutInflater y0(Bundle bundle) {
        LayoutInflater m0 = m0(bundle);
        this.Q = m0;
        return m0;
    }

    public LayoutInflater m0(Bundle bundle) {
        US0 us0 = this.y;
        if (us0 != null) {
            VS0 vs0 = us0.j;
            LayoutInflater cloneInContext = vs0.getLayoutInflater().cloneInContext(vs0);
            cloneInContext.setFactory2(this.z.f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void n0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f11484J = true;
        US0 us0 = this.y;
        if ((us0 == null ? null : us0.a) != null) {
            this.f11484J = true;
        }
    }

    public void f0(Context context) {
        this.f11484J = true;
        US0 us0 = this.y;
        if ((us0 == null ? null : us0.a) != null) {
            this.f11484J = false;
            e0();
        }
    }

    public void e0() {
        this.f11484J = true;
    }

    public void g0(Bundle bundle) {
        Bundle bundle2;
        this.f11484J = true;
        Bundle bundle3 = this.g;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.z.S(bundle2);
            h hVar = this.z;
            hVar.F = false;
            hVar.G = false;
            hVar.M.m = false;
            hVar.r(1);
        }
        h hVar2 = this.z;
        if (hVar2.t >= 1) {
            return;
        }
        hVar2.F = false;
        hVar2.G = false;
        hVar2.M.m = false;
        hVar2.r(1);
    }

    public final View C0() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(KS0.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void c0() {
        this.f11484J = true;
    }

    public void w0(Bundle bundle) {
        this.f11484J = true;
    }

    public void t0() {
        this.f11484J = true;
    }

    public void r0() {
        this.f11484J = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
    }

    public void p0() {
        this.f11484J = true;
    }

    public void u0() {
        this.f11484J = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f11484J = true;
    }

    public void k0() {
        this.f11484J = true;
    }

    public void j0() {
        this.f11484J = true;
    }

    public final void U() {
        T();
        this.S = this.k;
        this.k = UUID.randomUUID().toString();
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.w = 0;
        this.x = null;
        this.z = new h();
        this.y = null;
        this.B = 0;
        this.C = 0;
        this.D = null;
        this.E = false;
        this.F = false;
    }

    public void l0() {
        this.f11484J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        z0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void H(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.B));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.C));
        printWriter.print(" mTag=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.s);
        printWriter.print(" mInLayout=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.E);
        printWriter.print(" mDetached=");
        printWriter.print(this.F);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.G);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.x);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.y);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.l);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.g);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.i);
        }
        c R = R(false);
        if (R != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(R);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        NS0 ns0 = this.O;
        printWriter.println(ns0 == null ? false : ns0.a);
        NS0 ns02 = this.O;
        if ((ns02 == null ? 0 : ns02.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            NS0 ns03 = this.O;
            printWriter.println(ns03 == null ? 0 : ns03.b);
        }
        NS0 ns04 = this.O;
        if ((ns04 == null ? 0 : ns04.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            NS0 ns05 = this.O;
            printWriter.println(ns05 == null ? 0 : ns05.c);
        }
        NS0 ns06 = this.O;
        if ((ns06 == null ? 0 : ns06.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            NS0 ns07 = this.O;
            printWriter.println(ns07 == null ? 0 : ns07.d);
        }
        NS0 ns08 = this.O;
        if ((ns08 == null ? 0 : ns08.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            NS0 ns09 = this.O;
            printWriter.println(ns09 == null ? 0 : ns09.e);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.L);
        }
        if (K() != null) {
            C1593Mg3 c1593Mg3 = ((QE1) new C11491xd4(w(), QE1.i).a(QE1.class)).h;
            if (c1593Mg3.i() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (c1593Mg3.i() > 0) {
                    X5.a(c1593Mg3.j(0));
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(c1593Mg3.f(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.z + ":");
        this.z.t(AbstractC7848n0.a(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public ZS0 G() {
        return new LS0(this);
    }

    public void x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.z.L();
        this.v = true;
        this.V = new C7321lU0(this, w());
        View i0 = i0(layoutInflater, viewGroup, bundle);
        this.L = i0;
        if (i0 == null) {
            if (this.V.h != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.V = null;
            return;
        }
        this.V.b();
        this.L.setTag(R.id.view_tree_lifecycle_owner, this.V);
        this.L.setTag(R.id.view_tree_view_model_store_owner, this.V);
        View view = this.L;
        C7321lU0 c7321lU0 = this.V;
        AbstractC0087Ar1.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, c7321lU0);
        G02 g02 = this.W;
        C7321lU0 c7321lU02 = this.V;
        g02.getClass();
        G02.a("setValue");
        g02.g++;
        g02.e = c7321lU02;
        g02.c(null);
    }

    public final NS0 I() {
        if (this.O == null) {
            this.O = new NS0();
        }
        return this.O;
    }

    public final void D0(int i, int i2, int i3, int i4) {
        if (this.O == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        I().b = i;
        I().c = i2;
        I().d = i3;
        I().e = i4;
    }
}
