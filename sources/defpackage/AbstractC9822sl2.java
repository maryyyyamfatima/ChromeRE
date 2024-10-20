package defpackage;

import J.N;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.device_reauth.ReauthenticatorBridge;
import org.chromium.chrome.browser.password_check.CompromisedCredential;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sl2 */
/* loaded from: classes.dex */
public abstract class AbstractC9822sl2 {
    public static void a(final PropertyModel propertyModel, final View view, FD2 fd2) {
        int i;
        int i2;
        JD2 jd2 = AbstractC4670dl2.a;
        final CompromisedCredential compromisedCredential = (CompromisedCredential) propertyModel.i(jd2);
        if (fd2 == jd2) {
            ((TextView) view.findViewById(R.id.credential_origin)).setText(compromisedCredential.i);
            ((TextView) view.findViewById(R.id.compromised_username)).setText(compromisedCredential.j);
            TextView textView = (TextView) view.findViewById(R.id.compromised_reason);
            if (compromisedCredential.q) {
                i2 = !compromisedCredential.p ? R.string.0_resource_name_obfuscated_res_0x7f14079c : R.string.0_resource_name_obfuscated_res_0x7f14079b;
            } else {
                i2 = R.string.0_resource_name_obfuscated_res_0x7f14079a;
            }
            textView.setText(i2);
            ((ListMenuButton) view.findViewById(R.id.credential_menu_button)).e(new ZC1() { // from class: nl2
                @Override // defpackage.ZC1
                public final /* synthetic */ LI2 a(View view2) {
                    return YC1.a(view2);
                }

                @Override // defpackage.ZC1
                public final TC1 b() {
                    final Context context = view.getContext();
                    JD2 jd22 = AbstractC4670dl2.a;
                    PropertyModel propertyModel2 = propertyModel;
                    final CompromisedCredential compromisedCredential2 = (CompromisedCredential) propertyModel2.i(jd22);
                    final InterfaceC1483Lk2 interfaceC1483Lk2 = (InterfaceC1483Lk2) propertyModel2.i(AbstractC4670dl2.b);
                    C7616mK1 c7616mK1 = new C7616mK1();
                    c7616mK1.s(C4738dx.e(R.string.0_resource_name_obfuscated_res_0x7f140796, 0, 0, true));
                    c7616mK1.s(C4738dx.e(R.string.0_resource_name_obfuscated_res_0x7f140794, 0, 0, true));
                    c7616mK1.s(C4738dx.e(R.string.0_resource_name_obfuscated_res_0x7f140795, 0, 0, true));
                    return new C4738dx(context, c7616mK1, new SC1() { // from class: il2
                        @Override // defpackage.SC1
                        public final void b(PropertyModel propertyModel3) {
                            int h = propertyModel3.h(AbstractC4144cD1.a);
                            InterfaceC1483Lk2 interfaceC1483Lk22 = interfaceC1483Lk2;
                            final CompromisedCredential compromisedCredential3 = compromisedCredential2;
                            if (h == R.string.0_resource_name_obfuscated_res_0x7f140796) {
                                final C3983bl2 c3983bl2 = (C3983bl2) interfaceC1483Lk22;
                                c3983bl2.getClass();
                                AbstractC4326cl2.b(6);
                                C10159tk2 c10159tk2 = c3983bl2.a;
                                if (!((KeyguardManager) c10159tk2.a.getSystemService("keyguard")).isKeyguardSecure()) {
                                    ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f1407b6, 1, c10159tk2.a).d();
                                    return;
                                } else {
                                    c10159tk2.a(new Callback() { // from class: Yk2
                                        @Override // org.chromium.base.Callback
                                        public final ZE e0(Object obj) {
                                            return new ZE(this, obj);
                                        }

                                        @Override // org.chromium.base.Callback
                                        public final void onResult(Object obj) {
                                            C3983bl2 c3983bl22 = C3983bl2.this;
                                            c3983bl22.getClass();
                                            if (((Boolean) obj).booleanValue()) {
                                                AbstractC4326cl2.b(7);
                                                c3983bl22.d.o(AbstractC5357fl2.d, compromisedCredential3);
                                                c3983bl22.d.o(AbstractC5357fl2.e, new C3639al2(c3983bl22));
                                            }
                                        }
                                    }, 0);
                                    return;
                                }
                            }
                            if (h == R.string.0_resource_name_obfuscated_res_0x7f140794) {
                                C3983bl2 c3983bl22 = (C3983bl2) interfaceC1483Lk22;
                                c3983bl22.getClass();
                                AbstractC4326cl2.b(9);
                                C2392Sk2 c2392Sk2 = (C2392Sk2) c3983bl22.e;
                                N.M4w82atV(c2392Sk2.a.a, compromisedCredential3, context, c2392Sk2.c);
                                return;
                            }
                            if (h == R.string.0_resource_name_obfuscated_res_0x7f140795) {
                                C3983bl2 c3983bl23 = (C3983bl2) interfaceC1483Lk22;
                                c3983bl23.getClass();
                                AbstractC4326cl2.b(11);
                                c3983bl23.d.o(AbstractC5357fl2.c, compromisedCredential3.i);
                                c3983bl23.d.o(AbstractC5357fl2.b, new C3302Zk2(c3983bl23, compromisedCredential3));
                            }
                        }
                    });
                }
            }, true);
            ButtonCompat buttonCompat = (ButtonCompat) view.findViewById(R.id.credential_change_button);
            buttonCompat.setOnClickListener(new View.OnClickListener() { // from class: ol2
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View r6) {
                    /*
                        r5 = this;
                        JD2 r6 = defpackage.AbstractC4670dl2.b
                        org.chromium.ui.modelutil.PropertyModel r0 = org.chromium.ui.modelutil.PropertyModel.this
                        java.lang.Object r6 = r0.i(r6)
                        Lk2 r6 = (defpackage.InterfaceC1483Lk2) r6
                        bl2 r6 = (defpackage.C3983bl2) r6
                        r6.getClass()
                        org.chromium.chrome.browser.password_check.CompromisedCredential r0 = r2
                        boolean r1 = r0.s
                        if (r1 == 0) goto L17
                        r1 = 5
                        goto L18
                    L17:
                        r1 = 3
                    L18:
                        defpackage.AbstractC4326cl2.b(r1)
                        r1 = 0
                        defpackage.AbstractC4326cl2.a(r1, r0)
                        r2 = 1
                        r6.k = r2
                        Hk2 r3 = r6.e
                        Sk2 r3 = (defpackage.C2392Sk2) r3
                        r3.getClass()
                        org.chromium.url.GURL r3 = r0.getAssociatedUrl()
                        java.lang.String r4 = r0.getUsername()
                        J.N.MkPYGQUS(r3, r4)
                        Ik2 r6 = r6.c
                        r6.getClass()
                        java.lang.String r3 = r0.l
                        boolean r4 = r3.isEmpty()
                        java.lang.String r0 = r0.m
                        if (r4 == 0) goto L52
                        android.content.Context r4 = r6.a
                        java.util.Objects.requireNonNull(r4)
                        android.content.pm.PackageManager r4 = r4.getPackageManager()
                        android.content.Intent r4 = r4.getLaunchIntentForPackage(r0)
                        if (r4 == 0) goto L53
                    L52:
                        r1 = r2
                    L53:
                        if (r1 != 0) goto L56
                        goto L74
                    L56:
                        boolean r1 = r0.isEmpty()
                        android.content.Context r4 = r6.a
                        if (r1 == 0) goto L63
                        android.content.Intent r6 = r6.a(r2, r3)
                        goto L6e
                    L63:
                        java.util.Objects.requireNonNull(r4)
                        android.content.pm.PackageManager r6 = r4.getPackageManager()
                        android.content.Intent r6 = r6.getLaunchIntentForPackage(r0)
                    L6e:
                        android.content.ComponentName r0 = defpackage.AbstractC2281Ro1.a
                        r0 = 0
                        r4.startActivity(r6, r0)     // Catch: android.content.ActivityNotFoundException -> L74
                    L74:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC8451ol2.onClick(android.view.View):void");
                }
            });
            Drawable[] compoundDrawablesRelative = buttonCompat.getCompoundDrawablesRelative();
            Context context = view.getContext();
            int length = compoundDrawablesRelative.length;
            while (r3 < length) {
                Drawable drawable = compoundDrawablesRelative[r3];
                if (drawable != null) {
                    drawable.setTintList(Y50.b(context, R.color.0_resource_name_obfuscated_res_0x7f070151));
                }
                r3++;
            }
            if (compromisedCredential.s) {
                ((ButtonCompat) view.findViewById(R.id.credential_change_button_with_script)).setOnClickListener(new View.OnClickListener() { // from class: pl2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C3983bl2 c3983bl2 = (C3983bl2) ((InterfaceC1483Lk2) PropertyModel.this.i(AbstractC4670dl2.b));
                        ReauthenticatorBridge reauthenticatorBridge = c3983bl2.b;
                        boolean MuzO7zcq = N.MuzO7zcq(reauthenticatorBridge.a);
                        final CompromisedCredential compromisedCredential2 = compromisedCredential;
                        if (MuzO7zcq) {
                            C7928nE c7928nE = UN.a;
                            if (N.M09VlOh_("BiometricTouchToFill")) {
                                reauthenticatorBridge.b = new Callback() { // from class: Xk2
                                    @Override // org.chromium.base.Callback
                                    public final ZE e0(Object obj) {
                                        return new ZE(this, obj);
                                    }

                                    @Override // org.chromium.base.Callback
                                    public final void onResult(Object obj) {
                                        C3983bl2 c3983bl22 = C3983bl2.this;
                                        c3983bl22.getClass();
                                        if (((Boolean) obj).booleanValue()) {
                                            c3983bl22.g(compromisedCredential2);
                                        }
                                    }
                                };
                                N.Mt502WDx(reauthenticatorBridge.a, true);
                                return;
                            }
                        }
                        c3983bl2.g(compromisedCredential2);
                    }
                });
                return;
            }
            return;
        }
        if (fd2 == AbstractC4670dl2.b) {
            return;
        }
        HD2 hd2 = AbstractC4670dl2.c;
        if (fd2 == hd2) {
            ((ButtonCompat) view.findViewById(R.id.credential_change_button)).setVisibility(propertyModel.j(hd2) ? 0 : 8);
            ((TextView) view.findViewById(R.id.credential_change_hint)).setVisibility((propertyModel.j(hd2) || compromisedCredential.s) ? 8 : 0);
            return;
        }
        PD2 pd2 = AbstractC4670dl2.d;
        if (fd2 == pd2) {
            ImageView imageView = (ImageView) view.findViewById(R.id.credential_favicon);
            C2132Qk2 c2132Qk2 = (C2132Qk2) propertyModel.i(pd2);
            Resources resources = view.getResources();
            Context context2 = view.getContext();
            Bitmap bitmap = c2132Qk2.b;
            String str = c2132Qk2.a;
            if (c2132Qk2.d) {
                i = context2.getColor(R.color.0_resource_name_obfuscated_res_0x7f07010e);
            } else {
                i = c2132Qk2.c;
            }
            imageView.setImageDrawable(AbstractC4855eI0.d(bitmap, str, i, AbstractC4855eI0.a(context2), resources, resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08017a)));
        }
    }

    public static void c(View view, int i, Integer num) {
        int i2;
        if (i == 0 && num == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.check_status_icon);
        switch (i) {
            case 0:
                if (num.intValue() != 0) {
                    i2 = R.drawable.0_resource_name_obfuscated_res_0x7f090348;
                    break;
                } else {
                    i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0901d3;
                    break;
                }
            case 1:
            case 2:
            default:
                i2 = 0;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 7:
            case 8:
                i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0901f9;
                break;
        }
        imageView.setImageResource(i2);
        imageView.setVisibility(i == 1 ? 8 : 0);
        view.findViewById(R.id.check_status_progress).setVisibility(i != 1 ? 8 : 0);
    }

    public static void f(View view, int i, Integer num, Long l, Pair pair, final Runnable runnable) {
        CharSequence charSequence;
        int i2;
        String quantityString;
        if (i == 0 && (num == null || l == null)) {
            return;
        }
        if (i == 1 && pair == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.check_status_message);
        String str = null;
        switch (i) {
            case 0:
                if (num.intValue() == 0) {
                    charSequence = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a7);
                    break;
                } else {
                    charSequence = view.getContext().getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12002a, num.intValue(), num);
                    break;
                }
            case 1:
                if (pair.equals(AbstractC5013el2.i)) {
                    charSequence = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a8);
                    break;
                } else {
                    charSequence = String.format(b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a9), pair.first, pair.second);
                    break;
                }
            case 2:
            default:
                charSequence = null;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                charSequence = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a2);
                break;
            case 4:
                charSequence = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a1);
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                charSequence = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a5);
                break;
            case 6:
                charSequence = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a3);
                break;
            case 7:
                charSequence = AbstractC9108qg3.a(b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a4), new C8765pg3(new C11997z52(view.getContext(), new Callback() { // from class: rl2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        runnable.run();
                    }
                }), "<link>", "</link>"));
                break;
            case 8:
                charSequence = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407a6);
                break;
        }
        textView.setText(charSequence);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.check_status_text_layout);
        switch (i) {
            case 0:
                i2 = R.dimen.0_resource_name_obfuscated_res_0x7f0800d7;
                break;
            case 1:
                i2 = R.dimen.0_resource_name_obfuscated_res_0x7f0800d8;
                break;
            case 2:
            default:
                i2 = 0;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 7:
            case 8:
                i2 = R.dimen.0_resource_name_obfuscated_res_0x7f0800d6;
                break;
        }
        int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(i2);
        linearLayout.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        TextView textView2 = (TextView) view.findViewById(R.id.check_status_description);
        if (l != null) {
            Resources resources = view.getContext().getResources();
            Object[] objArr = new Object[1];
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            int i3 = (int) (currentTimeMillis / 86400000);
            int i4 = (int) (currentTimeMillis / 3600000);
            int i5 = (int) (currentTimeMillis / 60000);
            if (i3 > 0) {
                quantityString = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120022, i3, Integer.valueOf(i3));
            } else if (i4 > 0) {
                quantityString = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120023, i4, Integer.valueOf(i4));
            } else {
                quantityString = ((long) i5) > 0 ? resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120024, i5, Integer.valueOf(i5)) : resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14079f);
            }
            objArr[0] = quantityString;
            str = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1407a0, objArr);
        }
        textView2.setText(str);
        textView2.setVisibility(i != 0 ? 8 : 0);
    }

    public static void d(View view, int i, Integer num) {
        int i2;
        if (i == 0 && num == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.check_status_illustration);
        switch (i) {
            case 0:
                if (num.intValue() != 0) {
                    i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0903fe;
                    break;
                } else {
                    i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0903fc;
                    break;
                }
            case 1:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 7:
            case 8:
                i2 = R.drawable.0_resource_name_obfuscated_res_0x7f0903fb;
                break;
            case 2:
            default:
                i2 = 0;
                break;
        }
        imageView.setImageResource(i2);
    }

    public static void e(View view, int i, boolean z, Integer num) {
        String str;
        if (i == 0 && num == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.check_status_subtitle);
        switch (i) {
            case 0:
                if (num.intValue() == 0) {
                    str = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407ab);
                    break;
                } else {
                    str = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407aa);
                    break;
                }
            case 1:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 7:
            case 8:
                str = b(view, R.string.0_resource_name_obfuscated_res_0x7f1407aa);
                break;
            case 2:
            default:
                str = null;
                break;
        }
        textView.setText(str);
        textView.setVisibility(z ? 0 : 8);
    }

    public static String b(View view, int i) {
        return view.getContext().getResources().getString(i);
    }
}
