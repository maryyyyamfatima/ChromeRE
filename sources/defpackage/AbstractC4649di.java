package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.chromium.base.BundleUtils;
import org.chromium.base.LocaleUtils;
import org.chromium.ui.base.ResourceBundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: di */
/* loaded from: classes.dex */
public abstract class AbstractC4649di {
    public static final C4305ci a = new C4305ci();

    public static boolean b(String str) {
        if (TextUtils.equals(str, null)) {
            return false;
        }
        String b = LocaleUtils.b(str);
        HashSet hashSet = new HashSet();
        for (String str2 : ResourceBundle.a) {
            String b2 = LocaleUtils.b(str2);
            if (hashSet.contains(b2) && TextUtils.equals(b2, b)) {
                return true;
            }
            hashSet.add(LocaleUtils.b(str2));
        }
        return false;
    }

    public static void c(final String str, final InterfaceC7834mx1 interfaceC7834mx1) {
        InterfaceC7834mx1 interfaceC7834mx12 = new InterfaceC7834mx1() { // from class: bi
            @Override // defpackage.InterfaceC7834mx1
            public final void a(boolean z) {
                if (z) {
                    boolean a2 = AbstractC6205iD.a();
                    String str2 = str;
                    if (!a2) {
                        O83.a.t("Chrome.Language.ApplicationOverrideLanguage", str2);
                    } else {
                        new HF1().c(str2);
                    }
                }
                interfaceC7834mx1.a(z);
            }
        };
        if (!BundleUtils.c() || TextUtils.equals(str, null)) {
            interfaceC7834mx12.a(true);
            return;
        }
        if (C8178nx1.f == null) {
            C8178nx1.f = new C8178nx1();
        }
        final C8178nx1 c8178nx1 = C8178nx1.f;
        if (c8178nx1.b != null) {
            throw new UnsupportedOperationException("Only supports one language install at a time.");
        }
        c8178nx1.b = interfaceC7834mx12;
        C6802jx1 c6802jx1 = c8178nx1.a;
        InterfaceC2248Rh3 interfaceC2248Rh3 = c8178nx1.c;
        interfaceC2248Rh3.g(c6802jx1);
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C2508Th3 c2508Th3 = new C2508Th3();
        c2508Th3.b.add(forLanguageTag);
        C2638Uh3 c2638Uh3 = new C2638Uh3(c2508Th3);
        c8178nx1.e = (!BundleUtils.c() ? new HashSet(Arrays.asList(ResourceBundle.a)) : c8178nx1.c.f()).contains(str) || TextUtils.equals(str, null);
        ow4 e = interfaceC2248Rh3.e(c2638Uh3);
        C7146kx1 c7146kx1 = new C7146kx1(c8178nx1);
        e.getClass();
        ExecutorC7487lw4 executorC7487lw4 = AbstractC10338uF3.a;
        Av4 av4 = new Av4(executorC7487lw4, c7146kx1);
        Ov4 ov4 = e.b;
        synchronized (ov4.a) {
            if (ov4.b == null) {
                ov4.b = new ArrayDeque();
            }
            ov4.b.add(av4);
        }
        synchronized (e.a) {
            if (e.c) {
                e.b.a(e);
            }
        }
        C8169nv4 c8169nv4 = new C8169nv4(executorC7487lw4, new InterfaceC2742Vc2() { // from class: lx1
            @Override // defpackage.InterfaceC2742Vc2
            public final void c(Exception exc) {
                C8178nx1 c8178nx12 = C8178nx1.this;
                c8178nx12.getClass();
                AbstractC4851eH1.d("LanguageInstaller", "Language Split Failure:", exc);
                c8178nx12.b.a(false);
                c8178nx12.c.c(c8178nx12.a);
                c8178nx12.b = null;
                c8178nx12.d = 0;
                c8178nx12.e = false;
            }
        });
        Ov4 ov42 = e.b;
        synchronized (ov42.a) {
            if (ov42.b == null) {
                ov42.b = new ArrayDeque();
            }
            ov42.b.add(c8169nv4);
        }
        synchronized (e.a) {
            if (e.c) {
                e.b.a(e);
            }
        }
        interfaceC2248Rh3.a(Arrays.asList(forLanguageTag));
    }

    public static String a() {
        if (!AbstractC6205iD.a()) {
            return O83.a.i("Chrome.Language.ApplicationOverrideLanguage", null);
        }
        Locale a2 = new HF1().a();
        if (a2 == null) {
            return null;
        }
        return a2.toLanguageTag();
    }
}
