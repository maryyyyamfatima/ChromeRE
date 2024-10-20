package org.chromium.chrome.browser.tracing.settings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.C9727sU3;
import defpackage.InterfaceC9042qU3;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.L53;
import defpackage.O83;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.chromium.base.ContentUriUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tracing.TracingNotificationService;
import org.chromium.chrome.browser.tracing.settings.TracingSettings;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TracingSettings extends AbstractC0123Ay2 implements InterfaceC9042qU3 {
    public static final LinkedHashMap p0;
    public Preference j0;
    public Preference k0;
    public ListPreference l0;
    public Preference m0;
    public Preference n0;
    public Preference o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet] */
    public static Set S0() {
        ?? k = O83.a.k("tracing_categories", null);
        if (k == 0) {
            k = new HashSet();
            Iterator it = C9727sU3.a().d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!str.startsWith("disabled-by-default-")) {
                    k.add(str);
                }
            }
        }
        return k;
    }

    public static String T0() {
        return O83.a.i("tracing_mode", (String) p0.keySet().iterator().next());
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("record-until-full", "Record until full");
        linkedHashMap.put("record-as-much-as-possible", "Record until full (large buffer)");
        linkedHashMap.put("record-continuously", "Record continuously");
        p0 = linkedHashMap;
    }

    public static HashSet R0(int i) {
        HashSet hashSet = new HashSet();
        for (String str : S0()) {
            if (i == str.startsWith("disabled-by-default-")) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle("Tracing");
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f18003f);
        this.j0 = M0("default_categories");
        this.k0 = M0("non_default_categories");
        this.l0 = (ListPreference) M0("mode");
        this.m0 = M0("start_recording");
        this.n0 = M0("share_trace");
        this.o0 = M0("tracing_status");
        this.j0.l().putInt("type", 0);
        this.k0.l().putInt("type", 1);
        ListPreference listPreference = this.l0;
        LinkedHashMap linkedHashMap = p0;
        listPreference.a0 = (CharSequence[]) linkedHashMap.keySet().toArray(new String[linkedHashMap.size()]);
        String[] strArr = (String[]) linkedHashMap.values().toArray(new String[linkedHashMap.values().size()]);
        ListPreference listPreference2 = this.l0;
        listPreference2.Z = strArr;
        listPreference2.j = new InterfaceC9213qy2() { // from class: yU3
            @Override // defpackage.InterfaceC9213qy2
            public final boolean l(Preference preference, Object obj) {
                LinkedHashMap linkedHashMap2 = TracingSettings.p0;
                TracingSettings tracingSettings = TracingSettings.this;
                tracingSettings.getClass();
                O83.a.t("tracing_mode", (String) obj);
                tracingSettings.U0();
                return true;
            }
        };
        this.m0.k = new InterfaceC9555ry2() { // from class: zU3
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                LinkedHashMap linkedHashMap2 = TracingSettings.p0;
                TracingSettings tracingSettings = TracingSettings.this;
                tracingSettings.getClass();
                C9727sU3 a = C9727sU3.a();
                a.getClass();
                a.a = new TracingControllerAndroidImpl(V60.a);
                a.b(2);
                Context context = V60.a;
                AbstractC10756vU3.b = 0;
                String format = String.format("Trace buffer usage: %s%%", 0);
                AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    format = "Tracing is active.";
                }
                PO a2 = AbstractC10756vU3.a();
                a2.a.f("Chrome trace is being recorded");
                a2.a.e(format);
                a2.k(true);
                Intent intent = new Intent(context, (Class<?>) TracingNotificationService.class);
                intent.setAction("org.chromium.chrome.browser.tracing.STOP_RECORDING");
                a2.b(R.drawable.0_resource_name_obfuscated_res_0x7f090322, "Stop recording", PendingIntent.getService(context, 0, intent, 134217728 | AbstractC2281Ro1.d(false)));
                AbstractC10756vU3.a = a2;
                AbstractC10756vU3.b(a2.c());
                new C8699pU3(a).c(AbstractC0185Bl.e);
                tracingSettings.U0();
                return true;
            }
        };
        this.n0.R("Share trace");
        this.n0.k = new InterfaceC9555ry2() { // from class: AU3
            @Override // defpackage.InterfaceC9555ry2
            public final boolean p(Preference preference) {
                LinkedHashMap linkedHashMap2 = TracingSettings.p0;
                TracingSettings tracingSettings = TracingSettings.this;
                tracingSettings.getClass();
                final C9727sU3 a = C9727sU3.a();
                a.getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                Uri b = ContentUriUtils.b(a.e);
                intent.setType("application/gzip");
                intent.putExtra("android.intent.extra.STREAM", b);
                intent.addFlags(1);
                Context context = V60.a;
                Intent createChooser = Intent.createChooser(intent, "Share trace");
                createChooser.addFlags(268435456);
                context.startActivity(createChooser);
                PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: mU3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9727sU3 c9727sU3 = C9727sU3.this;
                        c9727sU3.getClass();
                        PostTask.c(QF3.h, new RunnableC9384rU3(c9727sU3.e));
                    }
                }, 3600000L);
                a.e = null;
                a.b(1);
                tracingSettings.U0();
                return true;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:            if (r5 != 0) goto L292;     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.tracing.settings.TracingSettings.U0():void");
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        U0();
        C9727sU3.a().b.a(this);
    }

    @Override // androidx.fragment.app.c
    public final void p0() {
        this.f11484J = true;
        C9727sU3.a().b.d(this);
    }
}
