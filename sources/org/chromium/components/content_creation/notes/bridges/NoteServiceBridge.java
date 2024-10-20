package org.chromium.components.content_creation.notes.bridges;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NoteServiceBridge {
    public long a;

    public static NoteServiceBridge create(long j) {
        return new NoteServiceBridge(j);
    }

    public NoteServiceBridge(long j) {
        this.a = j;
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }
}
