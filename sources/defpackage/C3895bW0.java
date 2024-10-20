package defpackage;

import com.google.android.libraries.elements.converters.properties.commands.platform.PlatformCommandResolver;
import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bW0 */
/* loaded from: classes.dex */
public final class C3895bW0 implements InterfaceC0209Bp3 {
    public final /* synthetic */ CommandHandler a;

    public C3895bW0(PlatformCommandResolver platformCommandResolver) {
        this.a = platformCommandResolver;
    }

    @Override // defpackage.InterfaceC0209Bp3
    public final Object get() {
        AbstractC0901Gy0.a();
        CommandHandlerResolver create = CommandHandlerResolver.create(this.a);
        if (create != null) {
            return create;
        }
        throw new C10239ty0("Error creating djinni CommandHandlerResolver.");
    }
}
