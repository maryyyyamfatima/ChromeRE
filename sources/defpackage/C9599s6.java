package defpackage;

import J.N;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.compositor.CompositorView;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s6 */
/* loaded from: classes.dex */
public class C9599s6 extends AbstractC10328uD3 {
    public final C4317ck a = new C4317ck();
    public final Tab b;
    public Activity c;
    public final InterfaceC7968nM d;
    public final boolean e;
    public final JC f;
    public final ZU0 g;
    public final InterfaceC10912vv3 h;
    public final InterfaceC0079Ap3 i;
    public final InterfaceC0079Ap3 j;
    public final InterfaceC0079Ap3 k;

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public int a() {
        return 1;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void showRepostFormWarningDialog() {
        Tab tab = this.b;
        C0224Bs3 c0224Bs3 = (C0224Bs3) tab.F().b(C0224Bs3.class);
        if (c0224Bs3 != null) {
            c0224Bs3.reset();
        }
        if (this.c == null || !tab.isUserInteractable()) {
            tab.b().i().y();
            return;
        }
        ZX1 zx1 = (ZX1) this.k.get();
        C2998Xb3 c2998Xb3 = new C2998Xb3(zx1, new Callback() { // from class: q6
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Integer num = (Integer) obj;
                Tab tab2 = C9599s6.this.b;
                if (tab2.isInitialized()) {
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        tab2.b().i().A();
                    } else {
                        if (intValue == 7 || intValue == 8) {
                            return;
                        }
                        tab2.b().i().y();
                    }
                }
            }
        });
        Resources resources = this.c.getResources();
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, c2998Xb3);
        bd2.d(AbstractC4249cY1.c, resources, R.string.0_resource_name_obfuscated_res_0x7f140510);
        bd2.e(AbstractC4249cY1.f, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14050e));
        bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f14050f);
        bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        bd2.b(AbstractC4249cY1.r, true);
        zx1.l(bd2.a(), 0, true);
    }

    public C9599s6(Tab tab, Activity activity, InterfaceC7968nM interfaceC7968nM, boolean z, JC jc, ZU0 zu0, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC0079Ap3 interfaceC0079Ap33) {
        this.b = tab;
        this.c = activity;
        this.d = interfaceC7968nM;
        this.e = z;
        this.f = jc;
        this.g = zu0;
        this.h = interfaceC10912vv3;
        this.i = interfaceC0079Ap3;
        this.j = interfaceC0079Ap32;
        this.k = interfaceC0079Ap33;
        tab.v(new C9256r6(this));
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void webContentsCreated(WebContents webContents, long j, long j2, String str, GURL gurl, WebContents webContents2) {
        this.a.put(webContents2, gurl);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean isFullscreenForTabOrPending() {
        ZU0 zu0 = this.g;
        if (zu0 != null) {
            return ((XU0) zu0).g();
        }
        return false;
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean shouldResumeRequestsForCreatedWindow() {
        return !this.h.b(this.b.isIncognito()).d();
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean addNewContents(WebContents webContents, WebContents webContents2, int i, Rect rect, boolean z) {
        Tab tab = this.b;
        AbstractC10569uv3 b = this.h.b(tab.isIncognito());
        GURL gurl = (GURL) this.a.remove(webContents2);
        if (tab.p()) {
            return false;
        }
        boolean z2 = b.d() || b.c(tab, webContents2, 4, gurl);
        if (z2) {
            if (i == 3) {
                if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_tab_group_auto_creation"), true)) {
                    InterfaceC0079Ap3 interfaceC0079Ap3 = this.i;
                    if (interfaceC0079Ap3.i() && ((AbstractC11276wz3) ((InterfaceC10590uz3) interfaceC0079Ap3.get())).c.d().G(tab.getId()).size() == 2) {
                        FI2.a("TabGroup.Created.DeveloperRequestedNewTab");
                    }
                }
                FI2.a("LinkNavigationOpenedInForegroundTab");
            } else if (i == 5) {
                AppHooks.get().y().a(3, V60.a, gurl.i(), "");
            }
        }
        return z2;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void activateContents() {
        if (this.c == null) {
            AbstractC4851eH1.a("ActivityTabWCDA", "Activity not set activateContents().  Bailing out.", new Object[0]);
            return;
        }
        if (((AbstractActivityC7416ll) this.d).m()) {
            AbstractC4851eH1.a("ActivityTabWCDA", "Activity destroyed before calling activateContents().  Bailing out.", new Object[0]);
            return;
        }
        Tab tab = this.b;
        if (!tab.isInitialized()) {
            AbstractC4851eH1.a("ActivityTabWCDA", "Tab not initialized before calling activateContents().  Bailing out.", new Object[0]);
            return;
        }
        C7089kn4 a = C7089kn4.a();
        if (!a.d() && !a.g) {
            a.g = true;
            a.b(a.e ? "NewActivity" : "FocusActivity");
            a.c("TimeToActivity");
        }
        if (tab.isUserInteractable()) {
            return;
        }
        TabModel j = ((AbstractC11276wz3) ((InterfaceC10590uz3) this.i.get())).j(tab.isIncognito());
        int s = j.s(tab);
        if (s == -1) {
            return;
        }
        j.q(s, 3, false);
        if (ApplicationStatus.c(this.c) == 5) {
            b();
        }
    }

    public void b() {
        Intent a = C1761No1.a(this.b.getId(), 0);
        a.addFlags(268435456);
        V60.a.startActivity(a);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean takeFocus(boolean z) {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        if (z) {
            View findViewById = activity.findViewById(R.id.menu_button);
            if (findViewById != null && findViewById.isShown()) {
                return findViewById.requestFocus();
            }
            View findViewById2 = this.c.findViewById(R.id.tab_switcher_button);
            if (findViewById2 != null && findViewById2.isShown()) {
                return findViewById2.requestFocus();
            }
        } else {
            View findViewById3 = activity.findViewById(R.id.url_bar);
            if (findViewById3 != null) {
                return findViewById3.requestFocus();
            }
        }
        return false;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void handleKeyboardEvent(KeyEvent keyEvent) {
        Activity activity;
        if (keyEvent.getAction() == 0 && (activity = this.c) != null) {
            if (activity.onKeyDown(keyEvent.getKeyCode(), keyEvent)) {
                return;
            }
            if (keyEvent.getKeyCode() == 111 && keyEvent.hasNoModifiers()) {
                WebContents b = this.b.b();
                if (b != null) {
                    b.stop();
                    return;
                }
                return;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 222) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return;
                    }
            }
        }
        ((AudioManager) V60.a.getSystemService("audio")).dispatchMediaKeyEvent(keyEvent);
    }

    @Override // defpackage.AbstractC10328uD3
    public final void setOverlayMode(boolean z) {
        CompositorView compositorView;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.j;
        if (!interfaceC0079Ap3.i() || (compositorView = ((CompositorViewHolder) interfaceC0079Ap3.get()).l) == null) {
            return;
        }
        N.M$Spxfoj(compositorView.k, compositorView, z);
        compositorView.h = z;
        compositorView.g.h(compositorView.b());
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsHeight() {
        JC jc = this.f;
        if (jc != null) {
            return ((CC) jc).m;
        }
        return 0;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsMinHeight() {
        JC jc = this.f;
        if (jc != null) {
            return ((CC) jc).n;
        }
        return 0;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getBottomControlsHeight() {
        JC jc = this.f;
        if (jc != null) {
            return ((CC) jc).o;
        }
        return 0;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getBottomControlsMinHeight() {
        JC jc = this.f;
        if (jc != null) {
            return ((CC) jc).p;
        }
        return 0;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldAnimateBrowserControlsHeightChanges() {
        JC jc = this.f;
        return jc != null && ((CC) jc).q;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean controlsResizeView() {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.j;
        return interfaceC0079Ap3.i() && ((CompositorViewHolder) interfaceC0079Ap3.get()).f11520J;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void enterFullscreenModeForTab(boolean z, boolean z2) {
        ZU0 zu0 = this.g;
        if (zu0 != null) {
            ((XU0) zu0).i(new C3546aV0(z, z2), this.b);
        }
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void fullscreenStateChangedForTab(boolean z, boolean z2) {
        ZU0 zu0 = this.g;
        if (zu0 == null || !((XU0) zu0).g()) {
            return;
        }
        ((XU0) zu0).i(new C3546aV0(z, z2), this.b);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void exitFullscreenModeForTab() {
        ZU0 zu0 = this.g;
        if (zu0 != null) {
            ((XU0) zu0).j(this.b);
        }
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean isPictureInPictureEnabled() {
        Activity activity = this.c;
        if (activity != null) {
            Context applicationContext = activity.getApplicationContext();
            if (Build.VERSION.SDK_INT >= 30) {
                TraceEvent i = TraceEvent.i("PictureInPicture::isEnabled", null);
                try {
                    r1 = ((AppOpsManager) applicationContext.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", applicationContext.getApplicationInfo().uid, applicationContext.getPackageName()) == 0;
                    if (i != null) {
                        i.close();
                    }
                } catch (Throwable th) {
                    if (i != null) {
                        try {
                            i.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            }
        }
        return r1;
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean isNightModeEnabled() {
        Activity activity = this.c;
        if (activity != null) {
            return AbstractC3899bX.e(activity);
        }
        return false;
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean isForceDarkWebContentEnabled() {
        Tab tab;
        WebContents b;
        Profile b2;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("WebContentsForceDark")) {
            return true;
        }
        if (!N.M09VlOh_("DarkenWebsitesCheckboxInThemesSetting") || (b = (tab = this.b).b()) == null || (b2 = Profile.b(tab.b())) == null) {
            return false;
        }
        return isNightModeEnabled() && AbstractC9824sl4.a(b2, b.u());
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean isCustomTab() {
        return this.e;
    }
}
