package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.internal.EmptyJSEnvironment;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import defpackage.AbstractC8868py0;
import defpackage.AbstractC9095qe2;
import defpackage.C10239ty0;
import defpackage.C4252cZ;
import defpackage.C4835eE0;
import defpackage.EnumC7791mq0;
import defpackage.InterfaceC9738sX;
import defpackage.KF;
import defpackage.OF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eE0 */
/* loaded from: classes.dex */
public final class C4835eE0 implements InterfaceC9395rX {
    public final JSEnvironment a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC3241Yy1 c;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final C5523gE0 c5523gE0 = (C5523gE0) obj;
        final JSController controller = this.a.getController();
        final SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((C2924Wn) abstractC9053qX).e;
        return new C4596dZ(new InterfaceC11463xZ() { // from class: com.google.android.libraries.elements.converters.properties.commands.a
            @Override // defpackage.InterfaceC11463xZ
            public final void a(C4252cZ c4252cZ) {
                C4835eE0 c4835eE0 = C4835eE0.this;
                JSController jSController = controller;
                if (jSController == null) {
                    c4835eE0.getClass();
                    throw new C10239ty0("JavaScript controller is not provided");
                }
                AbstractC9095qe2 abstractC9095qe2 = (AbstractC9095qe2) c4835eE0.b.get();
                if (!abstractC9095qe2.c()) {
                    throw new C10239ty0("ByteStore is not provided");
                }
                final ExecuteJSFunctionCommandHandler$JSFutureHandlerImpl executeJSFunctionCommandHandler$JSFutureHandlerImpl = new ExecuteJSFunctionCommandHandler$JSFutureHandlerImpl(c4252cZ);
                CommandExtensionResolverProxy commandExtensionResolverProxy = new CommandExtensionResolverProxy((InterfaceC9738sX) c4835eE0.c.get(), abstractC9053qX);
                byte[] byteArray = c5523gE0.toByteArray();
                byte[] bArr = AbstractC8868py0.a;
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = senderStateOuterClass$SenderState;
                jSController.executeFunction(byteArray, bArr, senderStateOuterClass$SenderState2 != null ? senderStateOuterClass$SenderState2.toByteArray() : bArr, (ByteStore) abstractC9095qe2.b(), commandExtensionResolverProxy, executeJSFunctionCommandHandler$JSFutureHandlerImpl);
                EnumC7791mq0.e(c4252cZ, new OF(new KF() { // from class: com.google.android.libraries.elements.converters.properties.commands.b
                    @Override // defpackage.KF
                    public final void cancel() {
                        ExecuteJSFunctionCommandHandler$JSFutureHandlerImpl.this.cancel();
                    }
                }));
            }
        });
    }

    public C4835eE0(EmptyJSEnvironment emptyJSEnvironment, C0806Gf0 c0806Gf0, InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = emptyJSEnvironment;
        this.b = c0806Gf0;
        this.c = interfaceC3241Yy1;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C5523gE0.r;
    }
}
