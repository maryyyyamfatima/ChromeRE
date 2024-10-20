package org.chromium.content.browser.accessibility;

import J.N;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import defpackage.C8605pC;
import defpackage.C8948qC;
import defpackage.InterfaceC9290rC;
import defpackage.V60;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.accessibility.BrowserAccessibilityState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BrowserAccessibilityState {
    public static boolean a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static boolean f;
    public static String[] g;
    public static Handler h;
    public static final Set i = Collections.newSetFromMap(new WeakHashMap());
    public static int j = 500;

    public static void registerObservers() {
        ContentResolver contentResolver = V60.a.getContentResolver();
        contentResolver.registerContentObserver(Settings.Global.getUriFor("animator_duration_scale"), false, new C8948qC(a()));
        contentResolver.registerContentObserver(Settings.Secure.getUriFor("enabled_accessibility_services"), false, new C8605pC(a()));
        if (a) {
            return;
        }
        b();
    }

    public static void b() {
        a = true;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        Context context = V60.a;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1);
        g = new String[enabledAccessibilityServiceList.size()];
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            b |= accessibilityServiceInfo.eventTypes;
            c |= accessibilityServiceInfo.feedbackType;
            d |= accessibilityServiceInfo.flags;
            e |= accessibilityServiceInfo.getCapabilities();
            String id = accessibilityServiceInfo.getId();
            int i3 = i2 + 1;
            g[i2] = id;
            ComponentName unflattenFromString = ComponentName.unflattenFromString(id);
            if (unflattenFromString != null) {
                arrayList.add(unflattenFromString.flattenToShortString());
            } else {
                arrayList.add(id);
            }
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList();
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
        if (string != null && !string.isEmpty()) {
            for (String str : string.split(":")) {
                if (str != null && !str.isEmpty()) {
                    ComponentName unflattenFromString2 = ComponentName.unflattenFromString(str);
                    if (unflattenFromString2 != null) {
                        arrayList2.add(unflattenFromString2.flattenToShortString());
                    } else {
                        arrayList2.add(str);
                    }
                }
            }
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        if (arrayList.equals(arrayList2)) {
            j = 500;
        } else {
            arrayList2.toString();
            arrayList.toString();
            a().postDelayed(new Runnable() { // from class: nC
                @Override // java.lang.Runnable
                public final void run() {
                    BrowserAccessibilityState.b();
                }
            }, j);
            int i4 = j;
            if (i4 < 60000) {
                j = i4 * 2;
            }
        }
        f = (b & 20484) != 0;
        for (InterfaceC9290rC interfaceC9290rC : i) {
            boolean z = f;
            WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) interfaceC9290rC;
            if (webContentsAccessibilityImpl.q()) {
                N.ME1Wl4ca(webContentsAccessibilityImpl.k, z, true);
                if (N.Mudil8Bg("OnDemandAccessibilityEvents")) {
                    int accessibilityServiceEventTypeMask = getAccessibilityServiceEventTypeMask();
                    HashSet hashSet = new HashSet();
                    while (accessibilityServiceEventTypeMask != 0) {
                        int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(accessibilityServiceEventTypeMask);
                        hashSet.add(Integer.valueOf(numberOfTrailingZeros));
                        accessibilityServiceEventTypeMask &= ~numberOfTrailingZeros;
                    }
                    webContentsAccessibilityImpl.I.c = hashSet;
                }
            }
        }
    }

    public static Handler a() {
        if (h == null) {
            h = new Handler(ThreadUtils.c());
        }
        return h;
    }

    public static int getAccessibilityServiceEventTypeMask() {
        if (!a) {
            b();
        }
        return b;
    }

    public static int getAccessibilityServiceFeedbackTypeMask() {
        if (!a) {
            b();
        }
        return c;
    }

    public static int getAccessibilityServiceFlagsMask() {
        if (!a) {
            b();
        }
        return d;
    }

    public static int getAccessibilityServiceCapabilitiesMask() {
        if (!a) {
            b();
        }
        return e;
    }

    public static String[] getAccessibilityServiceIds() {
        if (!a) {
            b();
        }
        return g;
    }
}
