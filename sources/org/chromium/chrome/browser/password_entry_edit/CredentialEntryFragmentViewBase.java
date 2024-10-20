package org.chromium.chrome.browser.password_entry_edit;

import J.N;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC7013kb0;
import defpackage.C10159tk2;
import defpackage.C2860Wa0;
import defpackage.C6669jb0;
import defpackage.DialogInterfaceOnClickListenerC11983z30;
import defpackage.InterfaceC7357lb0;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.YH2;
import java.lang.ref.WeakReference;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.password_entry_edit.BlockedCredentialFragmentView;
import org.chromium.chrome.browser.password_entry_edit.CredentialEditFragmentView;
import org.chromium.chrome.browser.password_entry_edit.FederatedCredentialFragmentView;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class CredentialEntryFragmentViewBase extends AbstractC0123Ay2 {
    public C2860Wa0 j0;
    public InterfaceC7357lb0 k0;

    @Override // androidx.fragment.app.c
    public final void h0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f62100_resource_name_obfuscated_res_0x7f100001, menu);
    }

    @Override // androidx.fragment.app.c
    public final boolean o0(MenuItem menuItem) {
        if (this.k0 == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId != R.id.action_delete_saved_password) {
            if (itemId != R.id.help_button) {
                return false;
            }
            ((C6669jb0) this.k0).d.run();
            return true;
        }
        final C6669jb0 c6669jb0 = (C6669jb0) this.k0;
        if (!c6669jb0.e) {
            DialogInterfaceOnClickListenerC11983z30 dialogInterfaceOnClickListenerC11983z30 = c6669jb0.b;
            WeakReference weakReference = dialogInterfaceOnClickListenerC11983z30.a;
            Resources resources = weakReference.get() == null ? null : ((Context) weakReference.get()).getResources();
            if (resources != null) {
                dialogInterfaceOnClickListenerC11983z30.a(resources.getString(R.string.f80390_resource_name_obfuscated_res_0x7f1407b2), resources.getString(c6669jb0.i ? R.string.f80200_resource_name_obfuscated_res_0x7f14079e : R.string.f80400_resource_name_obfuscated_res_0x7f1407b3, c6669jb0.f.i(AbstractC7013kb0.b)), R.string.f80380_resource_name_obfuscated_res_0x7f1407b1, new Runnable() { // from class: gb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6669jb0 c6669jb02 = C6669jb0.this;
                        c6669jb02.b();
                        N.MAcoX59m(c6669jb02.c.a);
                    }
                });
            }
        } else {
            c6669jb0.b();
            N.MAcoX59m(c6669jb0.c.a);
        }
        return true;
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public void t0() {
        super.t0();
        C2860Wa0 c2860Wa0 = this.j0;
        if (c2860Wa0 != null) {
            PropertyModel propertyModel = c2860Wa0.f;
            CredentialEntryFragmentViewBase credentialEntryFragmentViewBase = c2860Wa0.a;
            if (credentialEntryFragmentViewBase instanceof CredentialEditFragmentView) {
                UD2.a(propertyModel, (CredentialEditFragmentView) credentialEntryFragmentViewBase, new TD2() { // from class: Ta0
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        PropertyModel propertyModel2 = (PropertyModel) wd2;
                        final CredentialEditFragmentView credentialEditFragmentView = (CredentialEditFragmentView) obj;
                        FD2 fd2 = (FD2) obj2;
                        PD2 pd2 = AbstractC7013kb0.a;
                        if (fd2 == pd2) {
                            final InterfaceC7357lb0 interfaceC7357lb0 = (InterfaceC7357lb0) propertyModel2.i(pd2);
                            credentialEditFragmentView.k0 = interfaceC7357lb0;
                            ((ChromeImageButton) credentialEditFragmentView.L.findViewById(R.id.copy_username_button)).setOnClickListener(new View.OnClickListener() { // from class: Za0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i = CredentialEditFragmentView.q0;
                                    ((C6669jb0) interfaceC7357lb0).a(CredentialEditFragmentView.this.getActivity().getApplicationContext());
                                }
                            });
                            ((ChromeImageButton) credentialEditFragmentView.L.findViewById(R.id.copy_password_button)).setOnClickListener(new View.OnClickListener() { // from class: ab0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i = CredentialEditFragmentView.q0;
                                    final Context applicationContext = CredentialEditFragmentView.this.getActivity().getApplicationContext();
                                    final C6669jb0 c6669jb0 = (C6669jb0) interfaceC7357lb0;
                                    c6669jb0.getClass();
                                    Callback callback = new Callback() { // from class: ib0
                                        @Override // org.chromium.base.Callback
                                        public final ZE e0(Object obj3) {
                                            return new ZE(this, obj3);
                                        }

                                        @Override // org.chromium.base.Callback
                                        public final void onResult(Object obj3) {
                                            C6669jb0 c6669jb02 = C6669jb0.this;
                                            c6669jb02.getClass();
                                            if (((Boolean) obj3).booleanValue()) {
                                                EI2.h(4, 8, "PasswordManager.CredentialEntryActions.SavedPassword");
                                                Clipboard.getInstance().g((String) c6669jb02.f.i(AbstractC7013kb0.f));
                                                ZN3.b(R.string.f80510_resource_name_obfuscated_res_0x7f1407be, 0, applicationContext).d();
                                            }
                                        }
                                    };
                                    C10159tk2 c10159tk2 = c6669jb0.a;
                                    if (!((KeyguardManager) c10159tk2.a.getSystemService("keyguard")).isKeyguardSecure()) {
                                        ZN3.b(R.string.f80370_resource_name_obfuscated_res_0x7f1407b0, 1, c10159tk2.a).d();
                                    } else {
                                        c10159tk2.a(callback, 2);
                                    }
                                }
                            });
                            ((ChromeImageButton) credentialEditFragmentView.L.findViewById(R.id.password_visibility_button)).setOnClickListener(new View.OnClickListener() { // from class: bb0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i = CredentialEditFragmentView.q0;
                                    final C6669jb0 c6669jb0 = (C6669jb0) InterfaceC7357lb0.this;
                                    PropertyModel propertyModel3 = c6669jb0.f;
                                    LD2 ld2 = AbstractC7013kb0.e;
                                    if (propertyModel3.j(ld2)) {
                                        EI2.h(3, 8, "PasswordManager.CredentialEntryActions.SavedPassword");
                                        c6669jb0.f.k(ld2, false);
                                        return;
                                    }
                                    Callback callback = new Callback() { // from class: hb0
                                        @Override // org.chromium.base.Callback
                                        public final ZE e0(Object obj3) {
                                            return new ZE(this, obj3);
                                        }

                                        @Override // org.chromium.base.Callback
                                        public final void onResult(Object obj3) {
                                            C6669jb0 c6669jb02 = C6669jb0.this;
                                            c6669jb02.getClass();
                                            if (((Boolean) obj3).booleanValue()) {
                                                EI2.h(2, 8, "PasswordManager.CredentialEntryActions.SavedPassword");
                                                c6669jb02.f.k(AbstractC7013kb0.e, true);
                                            }
                                        }
                                    };
                                    C10159tk2 c10159tk2 = c6669jb0.a;
                                    if (!((KeyguardManager) c10159tk2.a.getSystemService("keyguard")).isKeyguardSecure()) {
                                        ZN3.b(R.string.f80430_resource_name_obfuscated_res_0x7f1407b6, 1, c10159tk2.a).d();
                                    } else {
                                        c10159tk2.a(callback, 0);
                                    }
                                }
                            });
                            credentialEditFragmentView.L.findViewById(R.id.button_primary).setOnClickListener(new View.OnClickListener() { // from class: cb0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i = CredentialEditFragmentView.q0;
                                    CredentialEditFragmentView credentialEditFragmentView2 = CredentialEditFragmentView.this;
                                    credentialEditFragmentView2.getClass();
                                    C6669jb0 c6669jb0 = (C6669jb0) interfaceC7357lb0;
                                    PropertyModel propertyModel3 = c6669jb0.f;
                                    PD2 pd22 = AbstractC7013kb0.c;
                                    boolean z = !((String) propertyModel3.i(pd22)).equals(c6669jb0.g);
                                    PropertyModel propertyModel4 = c6669jb0.f;
                                    PD2 pd23 = AbstractC7013kb0.f;
                                    boolean z2 = !((String) propertyModel4.i(pd23)).equals(c6669jb0.h);
                                    if (z && z2) {
                                        EI2.h(7, 8, "PasswordManager.CredentialEntryActions.SavedPassword");
                                    } else if (z) {
                                        EI2.h(5, 8, "PasswordManager.CredentialEntryActions.SavedPassword");
                                    } else if (z2) {
                                        EI2.h(6, 8, "PasswordManager.CredentialEntryActions.SavedPassword");
                                    }
                                    String str = (String) c6669jb0.f.i(pd22);
                                    String str2 = (String) c6669jb0.f.i(pd23);
                                    long j = c6669jb0.c.a;
                                    if (j != 0) {
                                        N.MXvicdfl(j, str, str2);
                                    }
                                    credentialEditFragmentView2.R0();
                                }
                            });
                            credentialEditFragmentView.L.findViewById(R.id.button_secondary).setOnClickListener(new View.OnClickListener() { // from class: db0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i = CredentialEditFragmentView.q0;
                                    CredentialEditFragmentView.this.R0();
                                }
                            });
                            credentialEditFragmentView.m0.addTextChangedListener(new C4951eb0(interfaceC7357lb0));
                            credentialEditFragmentView.o0.addTextChangedListener(new C5295fb0(interfaceC7357lb0));
                            return;
                        }
                        JD2 jd2 = AbstractC7013kb0.b;
                        if (fd2 == jd2) {
                            String str = (String) propertyModel2.i(jd2);
                            ((TextView) credentialEditFragmentView.L.findViewById(R.id.url_or_app)).setText(str);
                            ((TextView) credentialEditFragmentView.L.findViewById(R.id.edit_info)).setText(credentialEditFragmentView.Q(R.string.f80360_resource_name_obfuscated_res_0x7f1407af, str));
                            return;
                        }
                        if (fd2 == AbstractC7013kb0.h) {
                            return;
                        }
                        PD2 pd22 = AbstractC7013kb0.c;
                        if (fd2 == pd22) {
                            String str2 = (String) propertyModel2.i(pd22);
                            if (credentialEditFragmentView.m0.getText().toString().equals(str2)) {
                                return;
                            }
                            credentialEditFragmentView.m0.setText(str2);
                            return;
                        }
                        LD2 ld2 = AbstractC7013kb0.d;
                        if (fd2 == ld2) {
                            boolean j = propertyModel2.j(ld2);
                            credentialEditFragmentView.l0.l(j ? credentialEditFragmentView.O(R.string.f80410_resource_name_obfuscated_res_0x7f1407b4) : "");
                            boolean z = !j;
                            credentialEditFragmentView.p0.setEnabled(z);
                            credentialEditFragmentView.p0.setClickable(z);
                            return;
                        }
                        LD2 ld22 = AbstractC7013kb0.e;
                        if (fd2 == ld22) {
                            boolean j2 = propertyModel2.j(ld22);
                            if (j2) {
                                credentialEditFragmentView.getActivity().getWindow().setFlags(8192, 8192);
                                credentialEditFragmentView.o0.setInputType(131217);
                            } else {
                                credentialEditFragmentView.getActivity().getWindow().clearFlags(8192);
                                credentialEditFragmentView.o0.setInputType(131201);
                            }
                            ChromeImageButton chromeImageButton = (ChromeImageButton) credentialEditFragmentView.L.findViewById(R.id.password_visibility_button);
                            chromeImageButton.setImageResource(j2 ? R.drawable.f50540_resource_name_obfuscated_res_0x7f090338 : R.drawable.f50530_resource_name_obfuscated_res_0x7f090337);
                            chromeImageButton.setContentDescription(j2 ? credentialEditFragmentView.O(R.string.f80490_resource_name_obfuscated_res_0x7f1407bc) : credentialEditFragmentView.O(R.string.f80520_resource_name_obfuscated_res_0x7f1407bf));
                            return;
                        }
                        PD2 pd23 = AbstractC7013kb0.f;
                        if (fd2 == pd23) {
                            String str3 = (String) propertyModel2.i(pd23);
                            if (credentialEditFragmentView.o0.getText().toString().equals(str3)) {
                                return;
                            }
                            credentialEditFragmentView.o0.setText(str3);
                            return;
                        }
                        LD2 ld23 = AbstractC7013kb0.g;
                        if (fd2 != ld23) {
                            if (fd2 == AbstractC7013kb0.i) {
                                credentialEditFragmentView.R0();
                            }
                        } else {
                            boolean j3 = propertyModel2.j(ld23);
                            credentialEditFragmentView.n0.l(j3 ? credentialEditFragmentView.O(R.string.f80420_resource_name_obfuscated_res_0x7f1407b5) : "");
                            boolean z2 = !j3;
                            credentialEditFragmentView.p0.setEnabled(z2);
                            credentialEditFragmentView.p0.setClickable(z2);
                        }
                    }
                });
            } else if (credentialEntryFragmentViewBase instanceof BlockedCredentialFragmentView) {
                UD2.a(propertyModel, (BlockedCredentialFragmentView) credentialEntryFragmentViewBase, new TD2() { // from class: Ua0
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        PropertyModel propertyModel2 = (PropertyModel) wd2;
                        BlockedCredentialFragmentView blockedCredentialFragmentView = (BlockedCredentialFragmentView) obj;
                        FD2 fd2 = (FD2) obj2;
                        PD2 pd2 = AbstractC7013kb0.a;
                        if (fd2 != pd2) {
                            JD2 jd2 = AbstractC7013kb0.b;
                            if (fd2 == jd2) {
                                ((TextView) blockedCredentialFragmentView.L.findViewById(R.id.url_or_app)).setText((String) propertyModel2.i(jd2));
                                return;
                            } else {
                                if (fd2 == AbstractC7013kb0.i) {
                                    blockedCredentialFragmentView.R0();
                                    return;
                                }
                                return;
                            }
                        }
                        blockedCredentialFragmentView.k0 = (InterfaceC7357lb0) propertyModel2.i(pd2);
                    }
                });
            } else if (credentialEntryFragmentViewBase instanceof FederatedCredentialFragmentView) {
                UD2.a(propertyModel, (FederatedCredentialFragmentView) credentialEntryFragmentViewBase, new TD2() { // from class: Va0
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        PropertyModel propertyModel2 = (PropertyModel) wd2;
                        final FederatedCredentialFragmentView federatedCredentialFragmentView = (FederatedCredentialFragmentView) obj;
                        FD2 fd2 = (FD2) obj2;
                        PD2 pd2 = AbstractC7013kb0.a;
                        if (fd2 == pd2) {
                            final InterfaceC7357lb0 interfaceC7357lb0 = (InterfaceC7357lb0) propertyModel2.i(pd2);
                            federatedCredentialFragmentView.k0 = interfaceC7357lb0;
                            ((ChromeImageButton) federatedCredentialFragmentView.L.findViewById(R.id.copy_username_button)).setOnClickListener(new View.OnClickListener() { // from class: OI0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i = FederatedCredentialFragmentView.n0;
                                    ((C6669jb0) interfaceC7357lb0).a(FederatedCredentialFragmentView.this.getActivity().getApplicationContext());
                                }
                            });
                            return;
                        }
                        JD2 jd2 = AbstractC7013kb0.b;
                        if (fd2 != jd2) {
                            if (fd2 == AbstractC7013kb0.i) {
                                federatedCredentialFragmentView.R0();
                                return;
                            }
                            PD2 pd22 = AbstractC7013kb0.c;
                            if (fd2 != pd22) {
                                JD2 jd22 = AbstractC7013kb0.h;
                                if (fd2 == jd22) {
                                    ((TextView) federatedCredentialFragmentView.L.findViewById(R.id.password)).setText(federatedCredentialFragmentView.Q(R.string.f80860_resource_name_obfuscated_res_0x7f1407e2, (String) propertyModel2.i(jd22)));
                                    return;
                                }
                                return;
                            }
                            federatedCredentialFragmentView.m0.setText((String) propertyModel2.i(pd22));
                            return;
                        }
                        ((TextView) federatedCredentialFragmentView.L.findViewById(R.id.url_or_app)).setText((String) propertyModel2.i(jd2));
                    }
                });
            }
            c2860Wa0.f.o(AbstractC7013kb0.a, c2860Wa0.c);
        }
    }

    public final void R0() {
        getActivity().finish();
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        C10159tk2 c10159tk2;
        Callback callback;
        this.f11484J = true;
        C2860Wa0 c2860Wa0 = this.j0;
        if (c2860Wa0 == null || (callback = (c10159tk2 = c2860Wa0.b).c) == null) {
            return;
        }
        callback.onResult(Boolean.valueOf(YH2.a(0)));
        c10159tk2.c = null;
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        C2860Wa0 c2860Wa0;
        this.f11484J = true;
        if (!getActivity().isFinishing() || (c2860Wa0 = this.j0) == null) {
            return;
        }
        CredentialEditBridge credentialEditBridge = c2860Wa0.d;
        long j = credentialEditBridge.a;
        if (j != 0) {
            N.MtW4Yizq(j);
        }
        credentialEditBridge.a = 0L;
        CredentialEditBridge.c = null;
    }
}
