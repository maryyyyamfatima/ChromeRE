package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r72, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9265r72 implements InterfaceC0218Br2 {
    @Override // defpackage.InterfaceC0218Br2
    public final void b(int[] iArr, String[] strArr) {
        U72.a.getClass();
        if (strArr.length == 1 && iArr.length == 1 && strArr[0].equals("android.permission.POST_NOTIFICATIONS")) {
            EI2.b("Mobile.SystemNotification.Permission.OSPromptResult", iArr[0] == 0);
        }
    }
}
