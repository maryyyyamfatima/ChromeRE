package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.wallet.callback.CallbackInput;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC6438iu extends HandlerC10413uU3 {
    public final /* synthetic */ AbstractServiceC1924Ov a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6438iu(AbstractServiceC1924Ov abstractServiceC1924Ov, Looper looper) {
        super(looper);
        this.a = abstractServiceC1924Ov;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.replyTo == null) {
            return;
        }
        this.a.g.execute(new RunnableC7126ku(this.a, (CallbackInput) ST2.a(message.getData().getByteArray("extra_callback_input"), CallbackInput.CREATOR), message.replyTo, message.getData().getString("message_task_tag"), message.arg1));
    }
}
