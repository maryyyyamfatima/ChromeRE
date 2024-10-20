package defpackage;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.sync.TrustedVaultClient;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.chrome.browser.sync.ui.SyncTrustedVaultProxyActivity;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Et3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0619Et3 {
    public static final long a = TimeUnit.MILLISECONDS.convert(24, TimeUnit.HOURS);
    public static final /* synthetic */ int b = 0;

    public static String a(int i) {
        switch (i) {
            case 0:
                return "AuthError";
            case 1:
                return "PassphraseRequired";
            case 2:
                return "SyncSetupIncomplete";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "ClientOutOfDate";
            case 4:
                return "TrustedVaultKeyRequiredForEverything";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "TrustedVaultKeyRequiredForPasswords";
            case 6:
                return "TrustedVaultRecoverabilityDegradedForEverything";
            case 7:
                return "TrustedVaultRecoverabilityDegradedForPasswords";
            default:
                return "";
        }
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 4;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return 5;
            case 4:
                return 6;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return 7;
            case 6:
                return 3;
            case 7:
                return 2;
            default:
                return -1;
        }
    }

    public static void c(int i) {
        CoreAccountInfo c;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Context context = V60.a;
                Bundle S0 = ManageSyncSettings.S0(false);
                String name = ManageSyncSettings.class.getName();
                Intent a2 = AbstractC7459ls0.a(context, SettingsActivity.class);
                if (!(context instanceof Activity)) {
                    a2.addFlags(268435456);
                    a2.addFlags(67108864);
                }
                a2.putExtra("show_fragment", name);
                a2.putExtra("show_fragment_args", S0);
                ComponentName componentName = AbstractC2281Ro1.a;
                try {
                    context.startActivity(a2, null);
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                c = N.Mb4wS4pL(((SyncServiceImpl) AbstractC1658Mt3.b()).c) ? AbstractC1658Mt3.b().c() : null;
                if (c == null) {
                    return;
                }
                TrustedVaultClient.a().a.a(c).h(new Callback() { // from class: At3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Context context2 = V60.a;
                        Intent Q0 = SyncTrustedVaultProxyActivity.Q0((PendingIntent) obj, 3, 1);
                        ComponentName componentName2 = AbstractC2281Ro1.a;
                        try {
                            context2.startActivity(Q0, null);
                        } catch (ActivityNotFoundException unused2) {
                        }
                    }
                }, new Callback() { // from class: Bt3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        AbstractC4851eH1.f("SyncErrorPromptUtils", "Error creating trusted vault key retrieval intent: ", (Exception) obj);
                    }
                });
                return;
            case 6:
            case 7:
                c = N.Mb4wS4pL(((SyncServiceImpl) AbstractC1658Mt3.b()).c) ? AbstractC1658Mt3.b().c() : null;
                if (c == null) {
                    return;
                }
                TrustedVaultClient.a().a.g(c).h(new Callback() { // from class: Ct3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Context context2 = V60.a;
                        Intent Q0 = SyncTrustedVaultProxyActivity.Q0((PendingIntent) obj, 3, 2);
                        ComponentName componentName2 = AbstractC2281Ro1.a;
                        try {
                            context2.startActivity(Q0, null);
                        } catch (ActivityNotFoundException unused2) {
                        }
                    }
                }, new Callback() { // from class: Dt3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        AbstractC4851eH1.f("SyncErrorPromptUtils", "Error creating trusted vault recoverability intent: ", (Exception) obj);
                    }
                });
                return;
            default:
                return;
        }
    }
}
