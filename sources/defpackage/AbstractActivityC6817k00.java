package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k00 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC6817k00 extends Activity implements InterfaceC12177zd4, InterfaceC3762b61, InterfaceC10417uV2, InterfaceC0273Cc2, InterfaceC4103c6, InterfaceC1832Oc2, InterfaceC8059nd2, InterfaceC4965ed2, InterfaceC5309fd2, YS1, JA1, InterfaceC6440iu1 {
    public final ZS1 h;
    public final C10074tV2 j;
    public C11834yd4 k;
    public final C0143Bc2 l;
    public final C5099f00 m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final LA1 a = new LA1(this);
    public final S50 g = new S50();
    public final LA1 i = new LA1(this);

    @Override // defpackage.InterfaceC10417uV2
    public final C9731sV2 A() {
        return this.j.b;
    }

    public AbstractActivityC6817k00() {
        final VS0 vs0 = (VS0) this;
        this.h = new ZS1(new Runnable() { // from class: ZZ
            @Override // java.lang.Runnable
            public final void run() {
                vs0.invalidateOptionsMenu();
            }
        });
        C10074tV2 c10074tV2 = new C10074tV2(this);
        this.j = c10074tV2;
        this.l = new C0143Bc2(new RunnableC4068c00(vs0));
        new AtomicInteger();
        this.m = new C5099f00(vs0);
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        if (Z() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        Z().a(new C5443g00(vs0));
        Z().a(new C5787h00(vs0));
        Z().a(new C6131i00(vs0));
        c10074tV2.a();
        AbstractC7328lV2.a(this);
        if (i <= 23) {
            Z().a(new C9460ri1(vs0));
        }
        c10074tV2.b.b("android:support:activity-result", new InterfaceC9388rV2() { // from class: a00
            @Override // defpackage.InterfaceC9388rV2
            public final Bundle a() {
                AbstractActivityC6817k00 abstractActivityC6817k00 = vs0;
                abstractActivityC6817k00.getClass();
                Bundle bundle = new Bundle();
                C5099f00 c5099f00 = abstractActivityC6817k00.m;
                c5099f00.getClass();
                HashMap hashMap = c5099f00.c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c5099f00.e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c5099f00.h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", c5099f00.a);
                return bundle;
            }
        });
        b0(new InterfaceC2092Qc2() { // from class: b00
            @Override // defpackage.InterfaceC2092Qc2
            public final void a() {
                AbstractActivityC6817k00 abstractActivityC6817k00 = vs0;
                Bundle a = abstractActivityC6817k00.j.b.a("android:support:activity-result");
                if (a != null) {
                    C5099f00 c5099f00 = abstractActivityC6817k00.m;
                    c5099f00.getClass();
                    ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c5099f00.e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    c5099f00.a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    Bundle bundle = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c5099f00.h;
                    bundle2.putAll(bundle);
                    for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                        String str = stringArrayList.get(i2);
                        HashMap hashMap = c5099f00.c;
                        boolean containsKey = hashMap.containsKey(str);
                        HashMap hashMap2 = c5099f00.b;
                        if (containsKey) {
                            Integer num = (Integer) hashMap.remove(str);
                            if (!bundle2.containsKey(str)) {
                                hashMap2.remove(num);
                            }
                        }
                        int intValue = integerArrayList.get(i2).intValue();
                        String str2 = stringArrayList.get(i2);
                        hashMap2.put(Integer.valueOf(intValue), str2);
                        hashMap.put(str2, Integer.valueOf(intValue));
                    }
                }
            }
        });
    }

    public final void f0(Bundle bundle) {
        super.onCreate(bundle);
        FN2.c(this);
    }

    public final void g0(Bundle bundle) {
        LA1 la1 = this.a;
        la1.d("markState");
        EnumC11683yA1 enumC11683yA1 = EnumC11683yA1.CREATED;
        la1.d("setCurrentState");
        la1.f(enumC11683yA1);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.h.b.iterator();
        while (it.hasNext()) {
            ((C8004nT0) it.next()).a.n();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // defpackage.InterfaceC6440iu1
    public final boolean H(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    /* renamed from: d0 */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC6784ju1.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    /* renamed from: c0 */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC6784ju1.a(decorView, keyEvent)) {
            return AbstractC6784ju1.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.j.b(bundle);
        S50 s50 = this.g;
        s50.b = this;
        Iterator it = s50.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2092Qc2) it.next()).a();
        }
        f0(bundle);
        FN2.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LA1 Z = Z();
        if (Z instanceof LA1) {
            EnumC11683yA1 enumC11683yA1 = EnumC11683yA1.CREATED;
            Z.d("setCurrentState");
            Z.f(enumC11683yA1);
        }
        g0(bundle);
        this.j.c(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C6473j00 c6473j00;
        C11834yd4 c11834yd4 = this.k;
        if (c11834yd4 == null && (c6473j00 = (C6473j00) getLastNonConfigurationInstance()) != null) {
            c11834yd4 = c6473j00.a;
        }
        if (c11834yd4 == null) {
            return null;
        }
        C6473j00 c6473j002 = new C6473j00();
        c6473j002.a = c11834yd4;
        return c6473j002;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        e0();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        e0();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        super.addContentView(view, layoutParams);
    }

    private void e0() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        AbstractC0087Ar1.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0087Ar1.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void b0(InterfaceC2092Qc2 interfaceC2092Qc2) {
        S50 s50 = this.g;
        if (s50.b != null) {
            interfaceC2092Qc2.a();
        }
        s50.a.add(interfaceC2092Qc2);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Iterator it = this.h.b.iterator();
        while (it.hasNext()) {
            ((C8004nT0) it.next()).a.q(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = this.h.b.iterator();
        while (it.hasNext()) {
            ((C8004nT0) it.next()).a.h(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.h.a(menuItem);
    }

    @Override // defpackage.JA1
    public LA1 Z() {
        return this.i;
    }

    @Override // defpackage.InterfaceC12177zd4
    public final C11834yd4 w() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.k == null) {
            C6473j00 c6473j00 = (C6473j00) getLastNonConfigurationInstance();
            if (c6473j00 != null) {
                this.k = c6473j00.a;
            }
            if (this.k == null) {
                this.k = new C11834yd4();
            }
        }
        return this.k;
    }

    @Override // defpackage.InterfaceC3762b61
    public final E02 r() {
        E02 e02 = new E02();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = e02.a;
        if (application != null) {
            linkedHashMap.put(C10462ud4.a, getApplication());
        }
        linkedHashMap.put(AbstractC7328lV2.a, this);
        linkedHashMap.put(AbstractC7328lV2.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC7328lV2.c, getIntent().getExtras());
        }
        return e02;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.l.c();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.m.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.m.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((InterfaceC11989z40) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((InterfaceC11989z40) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((InterfaceC11989z40) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((InterfaceC11989z40) it.next()).accept(new C6819k02(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((InterfaceC11989z40) it.next()).accept(new C6819k02(z, 0));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((InterfaceC11989z40) it.next()).accept(new C1922Ou2(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((InterfaceC11989z40) it.next()).accept(new C1922Ou2(z, 0));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (MT3.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
