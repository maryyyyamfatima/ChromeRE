package defpackage;

import org.chromium.chrome.browser.notifications.NotificationPlatformBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G72 implements InterfaceC4322ck4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ NotificationPlatformBridge d;

    public G72(NotificationPlatformBridge notificationPlatformBridge, String str, String str2, String str3) {
        this.d = notificationPlatformBridge;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.InterfaceC4322ck4
    public final void a(String str, boolean z) {
        this.d.a(this.a, z ? this.b : null, this.c);
    }
}
