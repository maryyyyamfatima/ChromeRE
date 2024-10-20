package org.chromium.chrome.modules.stack_unwinder;

import defpackage.AbstractC0564Ei3;
import defpackage.InterfaceC0694Fi3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class StackUnwinderModuleProvider {
    public static boolean isModuleInstalled() {
        return AbstractC0564Ei3.a.g();
    }

    public static void installModule() {
        AbstractC0564Ei3.a.e();
    }

    public static void ensureNativeLoaded() {
        AbstractC0564Ei3.a.a();
    }

    public static long getCreateMemoryRegionsMapFunction() {
        return ((InterfaceC0694Fi3) AbstractC0564Ei3.a.b()).b();
    }

    public static long getCreateNativeUnwinderFunction() {
        return ((InterfaceC0694Fi3) AbstractC0564Ei3.a.b()).a();
    }
}
