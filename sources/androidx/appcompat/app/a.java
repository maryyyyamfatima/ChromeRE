package androidx.appcompat.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import defpackage.AbstractC0087Ar1;
import defpackage.AbstractC11973z12;
import defpackage.AbstractC12017z84;
import defpackage.C1195Jf;
import defpackage.C1898Op3;
import defpackage.C3139Ye;
import defpackage.C3269Ze;
import defpackage.C3487aJ1;
import defpackage.C8477op4;
import defpackage.C9701sP2;
import defpackage.Cif;
import defpackage.D5;
import defpackage.InterfaceC4631df;
import defpackage.J4;
import defpackage.JO3;
import defpackage.LayoutInflaterFactory2C0545Ef;
import defpackage.VS0;
import defpackage.Y50;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class a extends VS0 implements InterfaceC4631df {
    public LayoutInflaterFactory2C0545Ef x;

    @Override // defpackage.InterfaceC4631df
    public final void J() {
    }

    @Override // defpackage.InterfaceC4631df
    public final void T() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.InterfaceC4631df
    public final void x() {
    }

    public a() {
        this.j.b.b("androidx:appcompat", new C3139Ye(this));
        b0(new C3269Ze(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0545Ef) k0()).T = i;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0545Ef) k0()).w();
    }

    public final J4 l0() {
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) k0();
        layoutInflaterFactory2C0545Ef.B();
        return layoutInflaterFactory2C0545Ef.n;
    }

    public final void m0(Toolbar toolbar) {
        CharSequence charSequence;
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) k0();
        if (layoutInflaterFactory2C0545Ef.i instanceof Activity) {
            layoutInflaterFactory2C0545Ef.B();
            J4 j4 = layoutInflaterFactory2C0545Ef.n;
            if (j4 instanceof C8477op4) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C0545Ef.o = null;
            if (j4 != null) {
                j4.i();
            }
            layoutInflaterFactory2C0545Ef.n = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0545Ef.i;
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = layoutInflaterFactory2C0545Ef.p;
                }
                JO3 jo3 = new JO3(toolbar, charSequence, layoutInflaterFactory2C0545Ef.l);
                layoutInflaterFactory2C0545Ef.n = jo3;
                layoutInflaterFactory2C0545Ef.l.g = jo3.c;
            } else {
                layoutInflaterFactory2C0545Ef.l.g = null;
            }
            layoutInflaterFactory2C0545Ef.e();
        }
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) k0();
        if (layoutInflaterFactory2C0545Ef.o == null) {
            layoutInflaterFactory2C0545Ef.B();
            J4 j4 = layoutInflaterFactory2C0545Ef.n;
            layoutInflaterFactory2C0545Ef.o = new C1898Op3(j4 != null ? j4.f() : layoutInflaterFactory2C0545Ef.j);
        }
        return layoutInflaterFactory2C0545Ef.o;
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void setContentView(int i) {
        e0();
        k0().j(i);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void setContentView(View view) {
        e0();
        k0().k(view);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        k0().l(view, layoutParams);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        k0().c(view, layoutParams);
    }

    private void e0() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        AbstractC0087Ar1.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) k0();
        if (layoutInflaterFactory2C0545Ef.F && layoutInflaterFactory2C0545Ef.z) {
            layoutInflaterFactory2C0545Ef.B();
            J4 j4 = layoutInflaterFactory2C0545Ef.n;
            if (j4 != null) {
                j4.h();
            }
        }
        C1195Jf a = C1195Jf.a();
        Context context = layoutInflaterFactory2C0545Ef.j;
        synchronized (a) {
            C9701sP2 c9701sP2 = a.a;
            synchronized (c9701sP2) {
                C3487aJ1 c3487aJ1 = (C3487aJ1) c9701sP2.d.get(context);
                if (c3487aJ1 != null) {
                    c3487aJ1.b();
                }
            }
        }
        layoutInflaterFactory2C0545Ef.R = new Configuration(layoutInflaterFactory2C0545Ef.j.getResources().getConfiguration());
        layoutInflaterFactory2C0545Ef.o(false);
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) k0();
        layoutInflaterFactory2C0545Ef.B();
        J4 j4 = layoutInflaterFactory2C0545Ef.n;
        if (j4 != null) {
            j4.p(true);
        }
    }

    @Override // defpackage.VS0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0545Ef) k0()).o(true);
    }

    @Override // defpackage.VS0, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) k0();
        layoutInflaterFactory2C0545Ef.B();
        J4 j4 = layoutInflaterFactory2C0545Ef.n;
        if (j4 != null) {
            j4.p(false);
        }
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = (LayoutInflaterFactory2C0545Ef) k0();
        layoutInflaterFactory2C0545Ef.w();
        return layoutInflaterFactory2C0545Ef.k.findViewById(i);
    }

    @Override // defpackage.VS0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        J4 l0 = l0();
        if (menuItem.getItemId() == 16908332 && l0 != null && (l0.d() & 4) != 0 && (a = AbstractC11973z12.a(this)) != null) {
            if (shouldUpRecreateTask(a)) {
                ArrayList arrayList = new ArrayList();
                Intent a2 = AbstractC11973z12.a(this);
                if (a2 == null) {
                    a2 = AbstractC11973z12.a(this);
                }
                if (a2 != null) {
                    ComponentName component = a2.getComponent();
                    if (component == null) {
                        component = a2.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        Intent b = AbstractC11973z12.b(this, component);
                        while (b != null) {
                            arrayList.add(size, b);
                            b = AbstractC11973z12.b(this, b.getComponent());
                        }
                        arrayList.add(a2);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = Y50.a;
                startActivities(intentArr, null);
                try {
                    int i2 = D5.c;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            navigateUpTo(a);
            return true;
        }
        return false;
    }

    @Override // defpackage.VS0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k0().g();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k0().n(charSequence);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k0().e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public final Cif k0() {
        if (this.x == null) {
            int i = Cif.a;
            this.x = new LayoutInflaterFactory2C0545Ef(this, null, this, this);
        }
        return this.x;
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        J4 l0 = l0();
        if (keyCode == 82 && l0 != null && l0.k(keyEvent)) {
            return true;
        }
        return dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC12017z84.a;
        return super.getResources();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        J4 l0 = l0();
        if (getWindow().hasFeature(0)) {
            if (l0 == null || !l0.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        J4 l0 = l0();
        if (getWindow().hasFeature(0)) {
            if (l0 == null || !l0.a()) {
                super.closeOptionsMenu();
            }
        }
    }
}
