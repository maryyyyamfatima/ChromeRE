package defpackage;

import com.google.android.libraries.elements.converters.properties.commands.fusion.FusionCommandRunContext;
import com.google.android.libraries.elements.converters.properties.commands.platform.PlatformCommandResolver;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import defpackage.AbstractC9053qX;
import defpackage.C10081tX;
import defpackage.C2924Wn;
import defpackage.C4238cW0;
import defpackage.C4252cZ;
import defpackage.InterfaceC5627gZ;
import io.grpc.Status;
import j$.util.Optional;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tX */
/* loaded from: classes.dex */
public final class C10081tX implements InterfaceC9738sX {
    public final PlatformCommandResolver a;
    public final Optional b;
    public final CX c;
    public final boolean d;
    public final C3560aY e;

    public C10081tX(PlatformCommandResolver platformCommandResolver, Optional optional, Optional optional2, CX cx, C3560aY c3560aY) {
        this.a = platformCommandResolver;
        this.b = optional;
        this.c = cx;
        this.d = ((Boolean) optional2.orElse(Boolean.FALSE)).booleanValue();
        this.e = c3560aY;
    }

    public final VY a(final CommandOuterClass$Command commandOuterClass$Command, final AbstractC9053qX abstractC9053qX, int i) {
        final C4238cW0 c4238cW0;
        if (abstractC9053qX == null) {
            abstractC9053qX = AbstractC9053qX.a().a();
        }
        Optional optional = this.b;
        boolean isPresent = optional.isPresent();
        PlatformCommandResolver platformCommandResolver = this.a;
        VY vy = null;
        if (isPresent && (c4238cW0 = (C4238cW0) optional.orElse(null)) != null) {
            OX0 ox0 = X43.o;
            commandOuterClass$Command.getClass();
            ox0.getClass();
            commandOuterClass$Command.v(ox0);
            C5563gM0 c5563gM0 = commandOuterClass$Command.j;
            c5563gM0.getClass();
            NX0 nx0 = ox0.d;
            nx0.getClass();
            Object obj = c5563gM0.a.get(nx0);
            boolean z = true;
            if (!(obj != null)) {
                OX0 ox02 = C6299iV3.q;
                ox02.getClass();
                commandOuterClass$Command.v(ox02);
                C5563gM0 c5563gM02 = commandOuterClass$Command.j;
                c5563gM02.getClass();
                NX0 nx02 = ox02.d;
                nx02.getClass();
                if (!(c5563gM02.a.get(nx02) != null)) {
                    z = false;
                }
            }
            if (z) {
                vy = this.e.b(new C4596dZ(new InterfaceC11463xZ() { // from class: com.google.android.libraries.elements.converters.properties.a
                    @Override // defpackage.InterfaceC11463xZ
                    public final void a(InterfaceC5627gZ c4252cZ) {
                        C10081tX c10081tX = C10081tX.this;
                        c10081tX.getClass();
                        CommandRunCompletionCallback commandRunCompletionCallback = new CommandRunCompletionCallback(c10081tX, c4252cZ) { // from class: com.google.android.libraries.elements.converters.properties.CommandExtensionResolverImpl$1
                            final /* synthetic */ InterfaceC5627gZ val$emitter;

                            {
                                this.val$emitter = c4252cZ;
                            }

                            @Override // com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback
                            public void completion(Status status) {
                                if (status.b()) {
                                    ((C4252cZ) this.val$emitter).a();
                                    return;
                                }
                                ((C4252cZ) this.val$emitter).b(status.asException());
                            }
                        };
                        C4238cW0 c4238cW02 = c4238cW0;
                        c4238cW02.getClass();
                        AbstractC9053qX abstractC9053qX2 = abstractC9053qX;
                        if ((abstractC9053qX2 != null ? ((C2924Wn) abstractC9053qX2).e : null) == null) {
                            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.l;
                        }
                        if (abstractC9053qX2 == null) {
                            abstractC9053qX2 = AbstractC9053qX.a().a();
                        }
                        FusionCommandRunContext fusionCommandRunContext = new FusionCommandRunContext((ByteStore) c4238cW02.b.get(), abstractC9053qX2);
                        CommandHandlerResolver commandHandlerResolver = (CommandHandlerResolver) c4238cW02.a.get();
                        CommandOuterClass$Command commandOuterClass$Command2 = commandOuterClass$Command;
                        if (Optional.ofNullable(commandHandlerResolver.handleCommand(commandOuterClass$Command2, fusionCommandRunContext, commandRunCompletionCallback)).isPresent()) {
                            return;
                        }
                        c4252cZ.b(new IllegalArgumentException("Unsupported command: ".concat(String.valueOf(commandOuterClass$Command2))));
                    }
                }), commandOuterClass$Command, ((C2924Wn) abstractC9053qX).e, platformCommandResolver.createDebuggerTimelineEventId(abstractC9053qX), null);
            }
        }
        if (vy == null) {
            vy = platformCommandResolver.resolve(commandOuterClass$Command, abstractC9053qX);
        }
        if (i != 2 || this.d) {
            return vy;
        }
        CX cx = new CX(this.c.a, ((C2924Wn) abstractC9053qX).i);
        vy.getClass();
        return (VY) cx.a(vy);
    }
}
