package defpackage;

import com.google.android.libraries.elements.debug.DebuggerCallbackImpl;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pi0 */
/* loaded from: classes.dex */
public final class C8774pi0 {
    public final AtomicBoolean a = new AtomicBoolean();
    public byte[] b;
    public final /* synthetic */ DebuggerCallbackImpl c;

    public C8774pi0(DebuggerCallbackImpl debuggerCallbackImpl) {
        this.c = debuggerCallbackImpl;
    }

    public static void a(C8774pi0 c8774pi0) {
        InterfaceC9989tE2 interfaceC9989tE2;
        DebuggerCallbackImpl debuggerCallbackImpl = c8774pi0.c;
        C6120hy0 collectElementTrees = debuggerCallbackImpl.collectElementTrees();
        byte[] byteArray = collectElementTrees == null ? null : collectElementTrees.toByteArray();
        if (byteArray != null && !Arrays.equals(byteArray, c8774pi0.b)) {
            interfaceC9989tE2 = debuggerCallbackImpl.debuggerClient;
            ((DebuggerClient) interfaceC9989tE2.get()).traverseViewHierarchyResponse(byteArray);
            c8774pi0.b = byteArray;
        }
        if (c8774pi0.a.get()) {
            debuggerCallbackImpl.mainHandler.postDelayed(new RunnableC8431oi0(c8774pi0), 1000L);
        }
    }
}
