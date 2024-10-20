package org.chromium.components.content_creation.reactions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ReactionServiceBridge {
    public long a;

    public ReactionServiceBridge(long j) {
        this.a = j;
    }

    public static ReactionServiceBridge create(long j) {
        return new ReactionServiceBridge(j);
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }
}
