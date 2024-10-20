package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.MainSettings;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;
import org.chromium.components.signin.identitymanager.PrimaryAccountChangeEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942Hg1 implements V02, InterfaceC9979tC2, InterfaceC1072Ig1, InterfaceC9295rD {
    public final Context a;
    public I5 g;
    public final InterfaceC7697ma2 h;
    public IdentityManager j;
    public final C8610pD m;
    public boolean o;
    public final C0682Fg1 i = new Callback() { // from class: Fg1
        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }

        @Override // org.chromium.base.Callback
        public final void onResult(Object obj) {
            Profile profile = (Profile) obj;
            C0942Hg1 c0942Hg1 = C0942Hg1.this;
            IdentityManager identityManager = c0942Hg1.j;
            if (identityManager != null) {
                identityManager.d(c0942Hg1);
            }
            if (profile.i()) {
                c0942Hg1.j = null;
                return;
            }
            C1202Jg1.a().getClass();
            IdentityManager b = C1202Jg1.b(profile);
            c0942Hg1.j = b;
            b.a(c0942Hg1);
            c0942Hg1.b(true);
        }
    };
    public final C10322uC2[] k = new C10322uC2[3];
    public int l = 0;
    public final C12157za2 n = new C12157za2();

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void m(AccountInfo accountInfo) {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final void o(PrimaryAccountChangeEvent primaryAccountChangeEvent) {
        int i = primaryAccountChangeEvent.b;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            b(false);
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            C10322uC2[] c10322uC2Arr = this.k;
            C10322uC2 c10322uC2 = c10322uC2Arr[i2];
            if (c10322uC2 != null) {
                c10322uC2.e(this);
                c10322uC2Arr[i2] = null;
            }
        }
        b(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Fg1] */
    public C0942Hg1(a aVar, I5 i5, InterfaceC7697ma2 interfaceC7697ma2) {
        this.a = aVar;
        this.g = i5;
        this.h = interfaceC7697ma2;
        i5.b(this);
        this.m = new C8610pD(false, null, new View.OnClickListener() { // from class: Gg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0942Hg1 c0942Hg1 = C0942Hg1.this;
                LU3.a((Profile) ((C8385oa2) c0942Hg1.h).g).notifyEvent("identity_disc_used");
                FI2.a("MobileToolbarIdentityDiscTap");
                String name = MainSettings.class.getName();
                Intent intent = new Intent();
                Context context = c0942Hg1.a;
                intent.setClass(context, SettingsActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                    intent.addFlags(67108864);
                }
                intent.putExtra("show_fragment", name);
                ComponentName componentName = AbstractC2281Ro1.a;
                try {
                    context.startActivity(intent, null);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }, R.string.f66660_resource_name_obfuscated_res_0x7f14018c, false, new C12180ze1(aVar.getResources(), "IPH_IdentityDisc", R.string.f75320_resource_name_obfuscated_res_0x7f140550, R.string.f75310_resource_name_obfuscated_res_0x7f14054f), 0);
    }

    @Override // defpackage.V02
    public final void U() {
        this.g.c(this);
        this.g = null;
        this.o = true;
        ((C8385oa2) this.h).m(this.i);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void j(InterfaceC8953qD interfaceC8953qD) {
        this.n.a(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void d(InterfaceC8953qD interfaceC8953qD) {
        this.n.d(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final C8610pD h(Tab tab) {
        boolean z = tab != null && (tab.x() instanceof C10613v32);
        C8610pD c8610pD = this.m;
        if (!z) {
            c8610pD.a = false;
            return c8610pD;
        }
        a();
        return c8610pD;
    }

    public final void a() {
        if (this.o) {
            IdentityManager identityManager = this.j;
            String b = CoreAccountInfo.b(identityManager != null ? identityManager.b(0) : null);
            int i = b == null ? 0 : 1;
            this.l = i;
            C10322uC2[] c10322uC2Arr = this.k;
            if (i != 0 && c10322uC2Arr[i] == null) {
                int i2 = i == 1 ? R.dimen.f42320_resource_name_obfuscated_res_0x7f080805 : R.dimen.f42330_resource_name_obfuscated_res_0x7f080806;
                Context context = this.a;
                C10322uC2 c10322uC2 = new C10322uC2(context, context.getResources().getDimensionPixelSize(i2), null);
                c10322uC2.a(this);
                c10322uC2Arr[i] = c10322uC2;
            }
            int i3 = this.l;
            C8610pD c8610pD = this.m;
            if (i3 != 0) {
                C8267oD c8267oD = c8610pD.c;
                Drawable drawable = c10322uC2Arr[i3].c(b).b;
                if (c8267oD.a != drawable) {
                    c8267oD = new C8267oD(drawable, c8267oD.b, null, c8267oD.d, c8267oD.e, c8267oD.f, 0, c8267oD.i);
                }
                c8610pD.c = c8267oD;
                c8610pD.a = true;
                return;
            }
            c8610pD.a = false;
        }
    }

    public final void b(boolean z) {
        Iterator it = this.n.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8953qD) c11814ya2.next()).b(z);
            }
        }
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        if (this.l == 0) {
            return;
        }
        IdentityManager identityManager = this.j;
        if (str.equals(CoreAccountInfo.b(identityManager != null ? identityManager.b(0) : null))) {
            b(false);
            b(true);
        }
    }

    @Override // defpackage.InterfaceC9295rD
    public final void destroy() {
        I5 i5 = this.g;
        if (i5 != null) {
            i5.c(this);
            this.g = null;
        }
        for (int i = 0; i < 3; i++) {
            C10322uC2[] c10322uC2Arr = this.k;
            C10322uC2 c10322uC2 = c10322uC2Arr[i];
            if (c10322uC2 != null) {
                c10322uC2.e(this);
                c10322uC2Arr[i] = null;
            }
        }
        IdentityManager identityManager = this.j;
        if (identityManager != null) {
            identityManager.d(this);
            this.j = null;
        }
        if (this.o) {
            ((C8385oa2) this.h).n(this.i);
        }
    }
}
