package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.c;
import androidx.fragment.app.h;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VS0 extends AbstractActivityC6817k00 implements C5 {
    public boolean u;
    public boolean v;
    public final C3880bT0 s = new C3880bT0(new US0(this));
    public final LA1 t = new LA1(this);
    public boolean w = true;

    public void j0(c cVar) {
    }

    public final h h0() {
        return this.s.a.i;
    }

    public VS0() {
        this.j.b.b("android:support:lifecycle", new InterfaceC9388rV2() { // from class: QS0
            @Override // defpackage.InterfaceC9388rV2
            public final Bundle a() {
                VS0 vs0;
                do {
                    vs0 = VS0.this;
                } while (VS0.i0(vs0.h0()));
                vs0.t.e(EnumC11340xA1.ON_STOP);
                return new Bundle();
            }
        });
        this.n.add(new InterfaceC11989z40() { // from class: RS0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                VS0.this.s.a();
            }
        });
        this.p.add(new InterfaceC11989z40() { // from class: SS0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                VS0.this.s.a();
            }
        });
        b0(new InterfaceC2092Qc2() { // from class: TS0
            @Override // defpackage.InterfaceC2092Qc2
            public final void a() {
                US0 us0 = VS0.this.s.a;
                us0.i.b(us0, us0, null);
            }
        });
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.s.a.i.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.s.a.i.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.s.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t.e(EnumC11340xA1.ON_CREATE);
        h hVar = this.s.a.i;
        hVar.F = false;
        hVar.G = false;
        hVar.M.m = false;
        hVar.r(1);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.s.a.i.i();
        this.t.e(EnumC11340xA1.ON_DESTROY);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.s.a.i.g();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.v = false;
        this.s.a.i.r(5);
        this.t.e(EnumC11340xA1.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.s.a();
    }

    @Override // android.app.Activity
    public void onResume() {
        C3880bT0 c3880bT0 = this.s;
        c3880bT0.a();
        super.onResume();
        this.v = true;
        c3880bT0.a.i.w(true);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.t.e(EnumC11340xA1.ON_RESUME);
        h hVar = this.s.a.i;
        hVar.F = false;
        hVar.G = false;
        hVar.M.m = false;
        hVar.r(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        C3880bT0 c3880bT0 = this.s;
        c3880bT0.a();
        super.onStart();
        this.w = false;
        boolean z = this.u;
        US0 us0 = c3880bT0.a;
        if (!z) {
            this.u = true;
            h hVar = us0.i;
            hVar.F = false;
            hVar.G = false;
            hVar.M.m = false;
            hVar.r(4);
        }
        us0.i.w(true);
        this.t.e(EnumC11340xA1.ON_START);
        h hVar2 = us0.i;
        hVar2.F = false;
        hVar2.G = false;
        hVar2.M.m = false;
        hVar2.r(5);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.w = true;
        do {
        } while (i0(h0()));
        h hVar = this.s.a.i;
        hVar.G = true;
        hVar.M.m = true;
        hVar.r(4);
        this.t.e(EnumC11340xA1.ON_STOP);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:            if (android.os.Build.VERSION.SDK_INT >= 26) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0047, code lost:            if (android.os.Build.VERSION.SDK_INT >= 29) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:            if (android.os.Build.VERSION.SDK_INT >= 31) goto L31;     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VS0.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.s.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public static boolean i0(h hVar) {
        boolean z = false;
        for (c cVar : hVar.c.f()) {
            if (cVar != null) {
                US0 us0 = cVar.y;
                if ((us0 == null ? null : us0.j) != null) {
                    z |= i0(cVar.J());
                }
                C7321lU0 c7321lU0 = cVar.V;
                EnumC11683yA1 enumC11683yA1 = EnumC11683yA1.STARTED;
                EnumC11683yA1 enumC11683yA12 = EnumC11683yA1.CREATED;
                if (c7321lU0 != null && c7321lU0.Z().b.a(enumC11683yA1)) {
                    LA1 la1 = cVar.V.h;
                    la1.d("setCurrentState");
                    la1.f(enumC11683yA12);
                    z = true;
                }
                if (cVar.U.b.a(enumC11683yA1)) {
                    LA1 la12 = cVar.U;
                    la12.d("setCurrentState");
                    la12.f(enumC11683yA12);
                    z = true;
                }
            }
        }
        return z;
    }
}
