package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.device_reauth.ReauthenticatorBridge;
import org.chromium.chrome.browser.password_check.CompromisedCredential;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bl2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3983bl2 implements InterfaceC1483Lk2, InterfaceC0833Gk2 {
    public final C10159tk2 a;
    public final ReauthenticatorBridge b;
    public final C1093Ik2 c;
    public PropertyModel d;
    public InterfaceC0963Hk2 e;
    public Runnable f;
    public HashSet g;
    public final SettingsLauncher h;
    public final C2262Rk2 i;
    public long j;
    public boolean k;

    @Override // defpackage.InterfaceC0833Gk2
    public final void c() {
    }

    public C3983bl2(C1093Ik2 c1093Ik2, C10159tk2 c10159tk2, ReauthenticatorBridge reauthenticatorBridge, SettingsLauncher settingsLauncher, C2262Rk2 c2262Rk2) {
        this.c = c1093Ik2;
        this.a = c10159tk2;
        this.h = settingsLauncher;
        this.i = c2262Rk2;
        this.b = reauthenticatorBridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Type inference failed for: r6v4, types: [Wk2] */
    @Override // defpackage.InterfaceC0833Gk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3983bl2.b():void");
    }

    @Override // defpackage.InterfaceC0833Gk2
    public final void a(final int i) {
        long currentTimeMillis = System.currentTimeMillis();
        C5175fD1 c5175fD1 = (C5175fD1) this.d.i(AbstractC5357fl2.a);
        boolean z = false;
        if (c5175fD1.size() > 0 && ((C7272lK1) c5175fD1.get(0)).b.h(AbstractC5013el2.b) == 1 && i != 1 && this.j + 1000 > currentTimeMillis) {
            z = true;
        }
        if (z) {
            long j = this.j + 1000;
            this.j = j;
            PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: Uk2
                @Override // java.lang.Runnable
                public final void run() {
                    C3983bl2.this.e(i);
                }
            }, j - currentTimeMillis);
        } else {
            this.j = currentTimeMillis;
            e(i);
        }
    }

    public final void e(int i) {
        PropertyModel propertyModel;
        Integer num;
        if (i == 2) {
            return;
        }
        PropertyModel propertyModel2 = this.d;
        JD2 jd2 = AbstractC5357fl2.a;
        C5175fD1 c5175fD1 = (C5175fD1) propertyModel2.i(jd2);
        int i2 = 0;
        Long l = null;
        if (c5175fD1.size() == 0) {
            BD2 bd2 = new BD2(AbstractC5013el2.h);
            bd2.e(AbstractC5013el2.a, AbstractC5013el2.i);
            bd2.c(AbstractC5013el2.b, 1);
            bd2.e(AbstractC5013el2.c, null);
            bd2.e(AbstractC5013el2.d, null);
            bd2.e(AbstractC5013el2.e, this.f);
            bd2.e(AbstractC5013el2.f, new RunnableC2522Tk2(this));
            bd2.b(AbstractC5013el2.g, false);
            propertyModel = bd2.a();
        } else {
            propertyModel = ((C7272lK1) c5175fD1.get(0)).b;
        }
        ND2 nd2 = AbstractC5013el2.b;
        int h = propertyModel.h(nd2);
        propertyModel.m(nd2, i);
        PD2 pd2 = AbstractC5013el2.a;
        Pair pair = (Pair) propertyModel.i(pd2);
        if (pair == null) {
            pair = AbstractC5013el2.i;
        }
        if (i != 1) {
            pair = null;
        }
        propertyModel.o(pd2, pair);
        if (i == 0) {
            Integer valueOf = Integer.valueOf(N.Mu_fY_2N(((C2392Sk2) f()).a.a));
            Long valueOf2 = Long.valueOf(N.MXktgJl6(((C2392Sk2) f()).a.a));
            propertyModel.k(AbstractC5013el2.g, true);
            if (h == 1) {
                C5175fD1 c5175fD12 = (C5175fD1) this.d.i(jd2);
                int i3 = 0;
                for (int i4 = 1; i4 < c5175fD12.size(); i4++) {
                    i2++;
                    if (((CompromisedCredential) ((C7272lK1) c5175fD12.get(i4)).b.i(AbstractC4670dl2.a)).s) {
                        i3++;
                    }
                }
                EI2.c(i2, "PasswordManager.BulkCheck.CompromisedCredentialsCountAfterCheckAndroid");
                EI2.c(i3, "PasswordManager.BulkCheck.CompromisedCredentialsCountWithAutoChangeAfterCheckAndroid");
            }
            l = valueOf2;
            num = valueOf;
        } else {
            num = null;
        }
        propertyModel.o(AbstractC5013el2.c, l);
        propertyModel.o(AbstractC5013el2.d, num);
        if (c5175fD1.size() == 0) {
            c5175fD1.s(new C7272lK1(1, propertyModel));
        }
    }

    @Override // defpackage.InterfaceC0833Gk2
    public final void d(int i, int i2) {
        PropertyModel propertyModel = ((C7272lK1) ((C5175fD1) this.d.i(AbstractC5357fl2.a)).get(0)).b;
        ND2 nd2 = AbstractC5013el2.b;
        if (propertyModel.h(nd2) != 1) {
            this.j = System.currentTimeMillis();
            propertyModel.m(nd2, 1);
        }
        propertyModel.o(AbstractC5013el2.a, new Pair(Integer.valueOf(i), Integer.valueOf(i + i2)));
        propertyModel.o(AbstractC5013el2.c, null);
        propertyModel.o(AbstractC5013el2.d, null);
    }

    public final void g(CompromisedCredential compromisedCredential) {
        AbstractC4326cl2.b(4);
        AbstractC4326cl2.a(1, compromisedCredential);
        this.k = true;
        ((C2392Sk2) this.e).getClass();
        N.MeuktCqv(compromisedCredential.getAssociatedUrl(), compromisedCredential.getUsername());
        C1093Ik2 c1093Ik2 = this.c;
        c1093Ik2.getClass();
        String i = compromisedCredential.getAssociatedUrl().e().i();
        Intent a = c1093Ik2.a(2, i);
        String username = compromisedCredential.getUsername();
        a.putExtra("org.chromium.chrome.browser.autofill_assistant.ENABLED", true);
        a.putExtra("org.chromium.chrome.browser.autofill_assistant.INTENT", "PASSWORD_CHANGE");
        a.putExtra("org.chromium.chrome.browser.autofill_assistant.START_IMMEDIATELY", true);
        a.putExtra("org.chromium.chrome.browser.autofill_assistant.CALLER", 7);
        a.putExtra("org.chromium.chrome.browser.autofill_assistant.SOURCE", 11);
        a.putExtra("org.chromium.chrome.browser.autofill_assistant.PASSWORD_CHANGE_SKIP_LOGIN", false);
        try {
            a.putExtra("org.chromium.chrome.browser.autofill_assistant.ORIGINAL_DEEPLINK", URLEncoder.encode(i, "UTF-8"));
            a.putExtra("org.chromium.chrome.browser.autofill_assistant.PASSWORD_CHANGE_USERNAME", URLEncoder.encode(username, "UTF-8"));
            try {
                c1093Ik2.a.startActivity(a, null);
            } catch (ActivityNotFoundException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Encoding not available.", e);
        }
    }

    public final InterfaceC0963Hk2 f() {
        return AbstractC1872Ok2.b(this.h);
    }
}
