package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class CommandHandlerResolver {
    public abstract CommandHandler commandHandlerForExtension(int i);

    public abstract Integer handleCommand(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

    public abstract void handleCommandWithPlatformFallback(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

    public abstract boolean hasHandlerForExtension(int i);

    public abstract void registerCommandHandler(CommandHandler commandHandler, int i, CommandThread commandThread);

    public static CommandHandlerResolver create(CommandHandler commandHandler) {
        return CppProxy.create(commandHandler);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends CommandHandlerResolver {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native CommandHandlerResolver create(CommandHandler commandHandler);

        private native void nativeDestroy(long j);

        private native CommandHandler native_commandHandlerForExtension(long j, int i);

        private native Integer native_handleCommand(long j, CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

        private native void native_handleCommandWithPlatformFallback(long j, CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

        private native boolean native_hasHandlerForExtension(long j, int i);

        private native void native_registerCommandHandler(long j, CommandHandler commandHandler, int i, CommandThread commandThread);

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public CommandHandler commandHandlerForExtension(int i) {
            return native_commandHandlerForExtension(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public void registerCommandHandler(CommandHandler commandHandler, int i, CommandThread commandThread) {
            native_registerCommandHandler(this.nativeRef, commandHandler, i, commandThread);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public boolean hasHandlerForExtension(int i) {
            return native_hasHandlerForExtension(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public Integer handleCommand(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
            return native_handleCommand(this.nativeRef, commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public void handleCommandWithPlatformFallback(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
            native_handleCommandWithPlatformFallback(this.nativeRef, commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }
    }
}
