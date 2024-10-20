package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC8319oN1 extends Handler {
    public boolean a;
    public final /* synthetic */ AbstractC9005qN1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8319oN1(AbstractC9005qN1 abstractC9005qN1, Looper looper) {
        super(looper);
        this.b = abstractC9005qN1;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            int i = message.what;
            AbstractC9005qN1 abstractC9005qN1 = this.b;
            switch (i) {
                case 1:
                    C11768yR1.a(message.getData());
                    abstractC9005qN1.getClass();
                    return;
                case 2:
                    abstractC9005qN1.b((PlaybackStateCompat) message.obj);
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    abstractC9005qN1.a((MediaMetadataCompat) message.obj);
                    return;
                case 4:
                    abstractC9005qN1.getClass();
                    return;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    abstractC9005qN1.getClass();
                    return;
                case 6:
                    abstractC9005qN1.getClass();
                    return;
                case 7:
                    C11768yR1.a((Bundle) message.obj);
                    abstractC9005qN1.getClass();
                    return;
                case 8:
                    abstractC9005qN1.c();
                    return;
                case 9:
                    ((Integer) message.obj).intValue();
                    abstractC9005qN1.getClass();
                    return;
                case 10:
                default:
                    return;
                case 11:
                    ((Boolean) message.obj).booleanValue();
                    abstractC9005qN1.getClass();
                    return;
                case 12:
                    ((Integer) message.obj).intValue();
                    abstractC9005qN1.getClass();
                    return;
                case 13:
                    abstractC9005qN1.getClass();
                    return;
            }
        }
    }
}
