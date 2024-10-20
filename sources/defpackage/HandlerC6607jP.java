package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC6607jP extends Handler {
    public final int a;
    public final String b;
    public final HashMap c;
    public final Context d;
    public final C4502dG0 e;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
    }

    public HandlerC6607jP(Context context) {
        C4502dG0 c4502dG0 = C4502dG0.b;
        this.c = new HashMap();
        this.d = context;
        this.e = c4502dG0;
        this.a = 1;
        this.b = "";
    }

    @Override // android.os.Handler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean sendMessageAtTime(Message message, long j) {
        boolean e;
        Messenger messenger = message.replyTo;
        HashMap hashMap = this.c;
        if (!hashMap.containsKey(messenger)) {
            String str = this.b;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i = this.a;
            Context context = this.d;
            C4502dG0 c4502dG0 = this.e;
            if (!isEmpty) {
                e = c4502dG0.e(i, context, str);
            } else {
                e = c4502dG0.e(i, context, "");
            }
            hashMap.put(messenger, Boolean.valueOf(e));
        }
        if (((Boolean) hashMap.get(messenger)).booleanValue()) {
            return super.sendMessageAtTime(message, j);
        }
        return false;
    }
}
