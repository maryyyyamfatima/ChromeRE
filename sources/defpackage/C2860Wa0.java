package defpackage;

import com.android.chrome.R;
import java.lang.ref.WeakReference;
import org.chromium.chrome.browser.password_entry_edit.BlockedCredentialFragmentView;
import org.chromium.chrome.browser.password_entry_edit.CredentialEditBridge;
import org.chromium.chrome.browser.password_entry_edit.CredentialEntryFragmentViewBase;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wa0 */
/* loaded from: classes.dex */
public final class C2860Wa0 {
    public final CredentialEntryFragmentViewBase a;
    public final C10159tk2 b;
    public final C6669jb0 c;
    public final CredentialEditBridge d;
    public final C12008z71 e;
    public PropertyModel f;

    public C2860Wa0(CredentialEntryFragmentViewBase credentialEntryFragmentViewBase, CredentialEditBridge credentialEditBridge, CredentialEditBridge credentialEditBridge2, C12008z71 c12008z71) {
        this.a = credentialEntryFragmentViewBase;
        C10159tk2 c10159tk2 = new C10159tk2(credentialEntryFragmentViewBase.getActivity(), credentialEntryFragmentViewBase.M());
        this.b = c10159tk2;
        this.c = new C6669jb0(c10159tk2, new DialogInterfaceOnClickListenerC11983z30(new WeakReference(credentialEntryFragmentViewBase.K())), credentialEditBridge2, new Runnable() { // from class: Sa0
            public /* synthetic */ RunnableC2340Sa0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2860Wa0 c2860Wa0 = C2860Wa0.this;
                CredentialEntryFragmentViewBase credentialEntryFragmentViewBase2 = c2860Wa0.a;
                c2860Wa0.e.d(credentialEntryFragmentViewBase2.getActivity(), credentialEntryFragmentViewBase2.getActivity().getString(R.string.0_resource_name_obfuscated_res_0x7f1404ee), null, Profile.d());
            }
        }, credentialEntryFragmentViewBase instanceof BlockedCredentialFragmentView);
        this.d = credentialEditBridge;
        credentialEntryFragmentViewBase.j0 = this;
        this.e = c12008z71;
    }
}
