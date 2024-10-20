package org.chromium.components.crash;

import J.N;
import defpackage.AbstractC1041Ia0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CrashKeys {
    public static final String[] c = {"loaded_dynamic_module", "active_dynamic_module", "application_status", "installed_modules", "emulated_modules", "dynamic_module_dex_name", "partner_customization_config"};
    public final AtomicReferenceArray a = new AtomicReferenceArray(7);
    public boolean b;

    public static CrashKeys getInstance() {
        return AbstractC1041Ia0.a;
    }

    public void set(int i, String str) {
        Object obj = ThreadUtils.a;
        if (!this.b) {
            this.a.set(i, str);
        } else {
            N.Mk$gnuuz(this, i, str);
        }
    }

    public void flushToNative() {
        Object obj = ThreadUtils.a;
        int i = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (i >= atomicReferenceArray.length()) {
                this.b = true;
                return;
            } else {
                N.Mk$gnuuz(this, i, (String) atomicReferenceArray.getAndSet(i, null));
                i++;
            }
        }
    }
}
