package org.chromium.chrome.browser.feed;

import J.N;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.InterfaceC7610mJ0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedReliabilityLoggingBridge {
    public final long a = N.MaP9vcrt(this);
    public InterfaceC7610mJ0 b;
    public int c;
    public boolean d;
    public int e;

    public void logOtherLaunchStart(long j) {
        this.b.d(j);
    }

    public void logCacheReadStart(long j) {
        this.b.o(j);
    }

    public void logCacheReadEnd(long j, int i) {
        this.b.q(j, i);
    }

    public void logFeedRequestStart(int i, long j) {
        this.b.m(i).d(j);
    }

    public void logWebFeedRequestStart(int i, long j) {
        this.b.m(i).a(j);
    }

    public void logActionsUploadRequestStart(int i, long j) {
        this.b.m(i).c(j);
    }

    public void logRequestSent(int i, long j) {
        this.b.m(i).b(j);
    }

    public void logResponseReceived(int i, long j, long j2, long j3) {
        this.b.m(i).e(j, j2, j3);
    }

    public void logRequestFinished(int i, long j, int i2) {
        this.b.m(i).f(i2, j);
    }

    public void logAboveTheFoldRender(long j, int i) {
        int i2 = 1;
        if (!this.d) {
            this.b.a(j);
            this.d = true;
        }
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 3) {
                    i2 = i != 4 ? 0 : 4;
                }
            } else {
                i2 = 2;
            }
        }
        this.c = i2;
        if (i2 == 0) {
            this.c = 4;
        }
    }

    public void logLoadingIndicatorShown(long j) {
        this.b.h(j);
    }

    public void logLaunchFinishedAfterStreamUpdate(int i) {
        int i2;
        if (this.e != 0) {
            return;
        }
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i2 = 4;
                break;
            case 4:
            case 12:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 28:
            case 32:
            case 33:
            case 34:
            case 45:
            default:
                i2 = 0;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                i2 = 12;
                break;
            case 6:
                i2 = 24;
                break;
            case 7:
                i2 = 13;
                break;
            case 8:
                i2 = 14;
                break;
            case 9:
                i2 = 23;
                break;
            case 10:
                i2 = 15;
                break;
            case 11:
                i2 = 20;
                break;
            case 13:
                i2 = 16;
                break;
            case 15:
                i2 = 5;
                break;
            case 23:
                i2 = 6;
                break;
            case 24:
                i2 = 7;
                break;
            case 25:
                i2 = 8;
                break;
            case 26:
                i2 = 9;
                break;
            case 27:
                i2 = 10;
                break;
            case 29:
                i2 = 11;
                break;
            case 30:
                i2 = 19;
                break;
            case 31:
                i2 = 17;
                break;
            case 35:
                i2 = 25;
                break;
            case 36:
                i2 = 26;
                break;
            case 37:
                i2 = 27;
                break;
            case 38:
                i2 = 28;
                break;
            case 39:
                i2 = 29;
                break;
            case 40:
                i2 = 30;
                break;
            case 41:
                i2 = 31;
                break;
            case 42:
                i2 = 32;
                break;
            case 43:
                i2 = 21;
                break;
            case 44:
                i2 = 22;
                break;
            case 46:
                i2 = 18;
                break;
        }
        this.e = i2;
        if (i2 == 0) {
            this.e = 24;
        }
    }
}
