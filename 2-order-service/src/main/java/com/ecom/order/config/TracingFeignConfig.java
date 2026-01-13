//package com.ecom.order.config;
//
//import org.springframework.context.annotation.Configuration;
//
//import feign.RequestInterceptor;
//
//@Configuration
//public class TracingFeignConfig {
//	private static final Propagation.Setter<RequestTemplate, String> SETTER = RequestTemplate::header;
//
//	@Bean
//	public RequestInterceptor tracingInterceptor(Tracer tracer, Propagation.Factory propagationFactory,
//			CurrentTraceContext currentTraceContext) {
//		return template -> {
//			TraceContext context = currentTraceContext.get();
//			if (context != null) {
//				Propagation<String> propagation = propagationFactory.get();
//				propagation.injector(SETTER).inject(context, template);
//			}
//		};
//	}
//}
