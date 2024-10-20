package com.google.android.libraries.elements.debug;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.LoggingDelegate;
import com.google.android.libraries.elements.interfaces.LoggingLevel;
import defpackage.AbstractC10831vi0;
import defpackage.CH1;
import defpackage.DH1;
import defpackage.InterfaceC9989tE2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DebuggerLoggingDelegate extends LoggingDelegate {
    private final InterfaceC9989tE2 debuggerClient;
    private final boolean debuggerEnabled;

    public DebuggerLoggingDelegate(boolean z, InterfaceC9989tE2 interfaceC9989tE2) {
        this.debuggerEnabled = z;
        this.debuggerClient = interfaceC9989tE2;
    }

    @Override // com.google.android.libraries.elements.interfaces.LoggingDelegate
    public void log(LoggingLevel loggingLevel, String str, String str2) {
        if (this.debuggerEnabled) {
            CH1 ch1 = (CH1) DH1.q.j();
            if (ch1.h) {
                ch1.l();
                ch1.h = false;
            }
            DH1 dh1 = (DH1) ch1.g;
            dh1.getClass();
            str.getClass();
            dh1.j |= 8;
            dh1.n = str;
            if (ch1.h) {
                ch1.l();
                ch1.h = false;
            }
            DH1 dh12 = (DH1) ch1.g;
            dh12.getClass();
            str2.getClass();
            dh12.j |= 1;
            dh12.k = str2;
            int i = AbstractC10831vi0.a[loggingLevel.ordinal()];
            if (i == 1) {
                if (ch1.h) {
                    ch1.l();
                    ch1.h = false;
                }
                DH1 dh13 = (DH1) ch1.g;
                dh13.getClass();
                dh13.m = 3;
                dh13.j |= 4;
            } else if (i == 2) {
                if (ch1.h) {
                    ch1.l();
                    ch1.h = false;
                }
                DH1 dh14 = (DH1) ch1.g;
                dh14.getClass();
                dh14.m = 2;
                dh14.j |= 4;
            } else if (i == 3) {
                if (ch1.h) {
                    ch1.l();
                    ch1.h = false;
                }
                DH1 dh15 = (DH1) ch1.g;
                dh15.getClass();
                dh15.m = 1;
                dh15.j |= 4;
            }
            ((DebuggerClient) this.debuggerClient.get()).sendLog(((DH1) ch1.j()).toByteArray());
        }
    }
}
