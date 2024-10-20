package org.chromium.components.messages;

import defpackage.AbstractC5609gV1;
import defpackage.C5265fV1;
import defpackage.InterfaceC4578dV1;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MessageDispatcherBridge {
    public static boolean enqueueMessage(MessageWrapper messageWrapper, WebContents webContents, int i, boolean z) {
        InterfaceC4578dV1 a = AbstractC5609gV1.a(webContents.Q0());
        if (a == null) {
            return false;
        }
        ((C5265fV1) a).b(messageWrapper.g, webContents, i, z);
        return true;
    }

    public static boolean enqueueWindowScopedMessage(MessageWrapper messageWrapper, WindowAndroid windowAndroid, boolean z) {
        InterfaceC4578dV1 a = AbstractC5609gV1.a(windowAndroid);
        if (a == null) {
            return false;
        }
        ((C5265fV1) a).c(messageWrapper.g, z);
        return true;
    }

    public static void dismissMessage(MessageWrapper messageWrapper, WindowAndroid windowAndroid, int i) {
        InterfaceC4578dV1 a = AbstractC5609gV1.a(windowAndroid);
        if (a == null) {
            return;
        }
        ((C5265fV1) a).a(i, messageWrapper.g);
    }
}
