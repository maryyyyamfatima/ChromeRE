package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.HashSet;
import org.chromium.chrome.browser.password_entry_edit.CredentialEditBridge;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6669jb0 implements InterfaceC7357lb0 {
    public final C10159tk2 a;
    public final DialogInterfaceOnClickListenerC11983z30 b;
    public final CredentialEditBridge c;
    public final Runnable d;
    public final boolean e;
    public PropertyModel f;
    public String g;
    public String h;
    public boolean i;
    public HashSet j;

    public C6669jb0(C10159tk2 c10159tk2, DialogInterfaceOnClickListenerC11983z30 dialogInterfaceOnClickListenerC11983z30, CredentialEditBridge credentialEditBridge, RunnableC2340Sa0 runnableC2340Sa0, boolean z) {
        this.a = c10159tk2;
        this.b = dialogInterfaceOnClickListenerC11983z30;
        this.c = credentialEditBridge;
        this.d = runnableC2340Sa0;
        this.e = z;
    }

    public final void a(Context context) {
        EI2.h(1, 8, ((String) this.f.i(AbstractC7013kb0.h)).isEmpty() ? "PasswordManager.CredentialEntryActions.SavedPassword" : "PasswordManager.CredentialEntryActions.FederatedCredential");
        Clipboard.getInstance().h("username", (String) this.f.i(AbstractC7013kb0.c));
        ZN3.b(R.string.f80550_resource_name_obfuscated_res_0x7f1407c2, 0, context).d();
    }

    public final void b() {
        String str;
        if (this.e) {
            str = "PasswordManager.CredentialEntryActions.BlockedCredential";
        } else {
            str = !((String) this.f.i(AbstractC7013kb0.h)).isEmpty() ? "PasswordManager.CredentialEntryActions.FederatedCredential" : "PasswordManager.CredentialEntryActions.SavedPassword";
        }
        EI2.h(0, 8, str);
    }
}
