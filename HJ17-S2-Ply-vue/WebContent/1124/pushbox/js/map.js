function Maps(){
	var maps = [
			[ 
				[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
				[ 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 ],
				[ 0, 0, 0, 0, 1, 4, 1, 0, 0, 0 ], 
				[ 0, 1, 1, 1, 1, 3, 1, 0, 0, 0 ], 
				[ 0, 1, 4, 2, 3, 5, 1, 1, 1, 0 ],
				[ 0, 1, 1, 1, 3, 2, 3, 4, 1, 0 ], 
				[ 0, 0, 0, 1, 2, 1, 1, 1, 1, 0 ], 
				[ 0, 0, 0, 1, 4, 1, 0, 0, 0, 0 ],
				[ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 ], 
				[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ]
			],
			[ 
				[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
				[ 0, 0, 1, 1, 1, 1, 1, 1, 1, 0 ], 
				[ 0, 0, 1, 2, 5, 4, 4, 4, 1, 0 ],
				[ 0, 0, 1, 2, 2, 2, 2, 2, 1, 1 ], 
				[ 0, 1, 1, 1, 3, 2, 2, 2, 2, 1 ],
				[ 0, 1, 2, 2, 2, 2, 2, 2, 2, 1 ], 
				[ 0, 1, 2, 3, 2, 1, 3, 1, 2, 1 ],
				[ 0, 1, 2, 2, 2, 1, 2, 2, 2, 1 ], 
				[ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 ],
				[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
			],
			[
				[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ], 
				[ 0, 1, 1, 1, 1, 1, 0, 0, 0, 0 ],
				[ 0, 1, 2, 2, 5, 1, 0, 0, 0, 0 ], 
				[ 0, 1, 2, 3, 3, 1, 0, 1, 1, 1 ],
				[ 0, 1, 2, 3, 2, 1, 0, 1, 4, 1 ], 
				[ 0, 1, 1, 1, 2, 1, 1, 1, 4, 1 ],
				[ 0, 0, 1, 1, 2, 2, 2, 2, 4, 1 ], 
				[ 0, 0, 1, 2, 2, 2, 1, 2, 2, 1 ],
				[ 0, 0, 1, 2, 2, 2, 1, 1, 1, 1 ], 
				[ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0 ]
				
			],
			[
				[0,0,0,0,0,0,0,0,0,0],
				[0,1,1,1,1,1,1,1,0,0],
				[0,1,2,2,2,2,2,1,1,1],
				[1,1,3,1,1,1,2,2,2,1],
				[1,5,2,2,3,2,2,3,2,1],
				[1,2,4,4,1,2,3,2,1,1],
				[1,1,4,4,1,2,2,2,1,0],
				[0,1,1,1,1,1,1,1,1,0],
				[0,0,0,0,0,0,0,0,0,0],
				[0,0,0,0,0,0,0,0,0,0]
			],
			[
				[0,0,0,0,0,0,0,0,0,0],
				[0,0,0,1,1,1,1,0,0,0],
				[0,0,1,1,2,2,1,0,0,0],
				[0,0,1,5,3,2,1,0,0,0],
				[0,0,1,1,3,2,1,1,0,0],
				[0,0,1,1,2,3,2,1,0,0],
				[0,0,1,4,3,2,2,1,0,0],
				[0,0,1,4,4,9,4,1,0,0],
				[0,0,1,1,1,1,1,1,0,0],
				[0,0,0,0,0,0,0,0,0,0]
			]
		];	
	// 关数
	this.index = 0;
	// 本地地图
	this.next = function (){
		return maps [ this.index ++ % maps.length ];
	}
}

