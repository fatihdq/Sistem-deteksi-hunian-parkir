	mV}??=@mV}??=@!mV}??=@	;p]wk?/@;p]wk?/@!;p]wk?/@"e
=type.googleapis.com/tensorflow.profiler.PerGenericStepDetails$mV}??=@~??k	???A?6?[ 8@Y`??"?y@*	     m?@2P
Iterator::Model::Prefetch?q???@!p??X@)?q???@1p??X@:Preprocessing2F
Iterator::Model-???'@!      Y@)?HP???1vz?G????:Preprocessing:?
]Enqueuing data: you may want to combine small input data chunks into fewer but larger chunks.
?Data preprocessing: you may increase num_parallel_calls in <a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#map" target="_blank">Dataset map()</a> or preprocess the data OFFLINE.
?Reading data from files in advance: you may tune parameters in the following tf.data API (<a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#prefetch" target="_blank">prefetch size</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#interleave" target="_blank">interleave cycle_length</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/TFRecordDataset#class_tfrecorddataset" target="_blank">reader buffer_size</a>)
?Reading data from files on demand: you should read data IN ADVANCE using the following tf.data API (<a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#prefetch" target="_blank">prefetch</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/Dataset#interleave" target="_blank">interleave</a>, <a href="https://www.tensorflow.org/api_docs/python/tf/data/TFRecordDataset#class_tfrecorddataset" target="_blank">reader buffer</a>)
?Other data reading or processing: you may consider using the <a href="https://www.tensorflow.org/programmers_guide/datasets" target="_blank">tf.data API</a> (if you are not using it now)?
:type.googleapis.com/tensorflow.profiler.BottleneckAnalysis?
both?Your program is MODERATELY input-bound because 15.9% of the total step time sampled is waiting for input. Therefore, you would need to reduce both the input time and other time.no*no9;p]wk?/@>Look at Section 3 for the breakdown of input time on the host.B?
@type.googleapis.com/tensorflow.profiler.GenericStepTimeBreakdown?
	~??k	???~??k	???!~??k	???      ??!       "      ??!       *      ??!       2	?6?[ 8@?6?[ 8@!?6?[ 8@:      ??!       B      ??!       J	`??"?y@`??"?y@!`??"?y@R      ??!       Z	`??"?y@`??"?y@!`??"?y@JCPU_ONLYY;p]wk?/@b 